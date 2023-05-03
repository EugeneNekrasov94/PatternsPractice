package org.example.eugen.proxy;

import org.example.eugen.proxy.downloader.YouTubeDownloader;
import org.example.eugen.proxy.proxy.YouTubeCacheProxy;
import org.example.eugen.proxy.some_cool_media_library.ThirdPartyYouTubeClass;

public class Main {

    public static void main(String[] args) {
        YouTubeDownloader nativeDownloader = new YouTubeDownloader(new ThirdPartyYouTubeClass());
        YouTubeDownloader proxyCachedDl = new YouTubeDownloader(new YouTubeCacheProxy());

        long nativ = test(nativeDownloader);
        long proxied = test(proxyCachedDl);

        System.out.println(proxied + " " + nativ);
    }

    private static long test(YouTubeDownloader downloader) {
        long startTime = System.currentTimeMillis();

        // User behavior in our app:
        downloader.renderPopularVideos();
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("dancesvideoo");
        // Users might visit the same page quite often.
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderVideoPage("someothervid");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.print("Time elapsed: " + estimatedTime + "ms\n");
        return estimatedTime;
    }
}
