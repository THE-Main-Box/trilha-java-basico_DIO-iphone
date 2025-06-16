package service_models.base_model;

import components_model.MediaManagementComponent;
import media_models.model.Video;
import service_models.interfaces.MediaPlayer;

public class BaseVideoPlayer implements MediaPlayer {

    protected MediaManagementComponent mediaManager = new MediaManagementComponent();

    public void addVideo(Video video) {
        mediaManager.addMedia(video);
    }

    public void selectVideo(String key) {
        mediaManager.selectCurrentMediaByKey(key);
    }

    public void play() {
        this.play(mediaManager.getCurrentMedia());
    }

    public void pause() {
        this.pause(mediaManager.getCurrentMedia());
    }

}
