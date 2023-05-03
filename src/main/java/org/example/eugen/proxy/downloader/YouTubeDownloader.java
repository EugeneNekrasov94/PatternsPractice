package org.example.eugen.proxy.downloader;

import org.example.eugen.proxy.some_cool_media_library.ThirdPartyYouTubeLib;
import org.example.eugen.proxy.some_cool_media_library.Video;

import java.util.HashMap;

public class YouTubeDownloader {
    private ThirdPartyYouTubeLib realService;

    public YouTubeDownloader(ThirdPartyYouTubeLib realService) {
        this.realService = realService;
    }

    public void renderVideoPage(String videoId) {
        Video video = realService.getVideo(videoId);
        System.out.println("\n-------------------------------");
        System.out.println("Video page (imagine fancy HTML)");
        System.out.println("ID: " + video.id);
        System.out.println("Title: " + video.title);
        System.out.println("Video: " + video.data);
        System.out.println("-------------------------------\n");
    }

    public void renderPopularVideos() {
        HashMap<String, Video> list = realService.popularVideos();
        System.out.println("\n-------------------------------");
        System.out.println("Most popular videos on YouTube (imagine fancy HTML)");
        for (Video video : list.values()) {
            System.out.println("ID: " + video.id + " / Title: " + video.title);
        }
        System.out.println("-------------------------------\n");
    }
}
