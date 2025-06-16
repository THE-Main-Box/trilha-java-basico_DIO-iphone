package services.media_service.base_models;

import components_model.MediaManagementComponent;
import services.media_service.model.models.Video;

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
