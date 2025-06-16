package service_models.interfaces;

import media_models.base_model.Media;

public interface MediaPlayer {
    default void play(Media media) {
        if (media == null) return;
        media.play();
    }

    default void pause(Media media) {
        if (media == null) return;
        media.pause();
    }
}
