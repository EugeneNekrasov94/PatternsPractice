package org.example.eugen.proxy.proxy;

import org.example.eugen.proxy.some_cool_media_library.ThirdPartyYouTubeClass;
import org.example.eugen.proxy.some_cool_media_library.ThirdPartyYouTubeLib;
import org.example.eugen.proxy.some_cool_media_library.Video;

import java.util.HashMap;

public class YouTubeCacheProxy implements ThirdPartyYouTubeLib {
    private ThirdPartyYouTubeLib realService;
    private HashMap<String, Video> cachePopular = new HashMap<>();
    private HashMap<String, Video> cacheAll = new HashMap<>();

    public YouTubeCacheProxy() {
        this.realService = new ThirdPartyYouTubeClass();
    }

    @Override
    public HashMap<String, Video> popularVideos() {
        if (cachePopular.isEmpty()) {
            return realService.popularVideos();
        }else {
            System.out.println("Retrieved videos from cache!");
        }
        return cachePopular;
    }

    @Override
    public Video getVideo(String videoId) {
        Video video = cacheAll.get(videoId);

        if (video == null) {
            video = realService.getVideo(videoId);
            cacheAll.put(videoId,video);
        } else {
            System.out.println("Retrieved video from cache!");
        }
        return video;
    }

    public void resetCache() {
        cacheAll.clear();
        cachePopular.clear();
    }
}
