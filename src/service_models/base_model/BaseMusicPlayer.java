package service_models.base_model;

import components_model.MediaManagementComponent;
import media_models.model.Music;
import service_models.interfaces.MediaPlayer;

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
