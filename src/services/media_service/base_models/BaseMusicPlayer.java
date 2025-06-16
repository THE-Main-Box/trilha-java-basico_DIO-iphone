package services.media_service.base_models;

import components_model.MediaManagementComponent;
import services.media_service.model.models.Music;

public class BaseMusicPlayer implements MediaPlayer {
    protected MediaManagementComponent mediaManager = new MediaManagementComponent();

    public void addMusic(Music music) {
        mediaManager.addMedia(music);
    }

    public void selectMusic(String key) {
        mediaManager.selectCurrentMediaByKey(key);
    }

    public void play() {
        this.play(mediaManager.getCurrentMedia());
    }

    public void pause(){
        this.pause(mediaManager.getCurrentMedia());
    }
}
