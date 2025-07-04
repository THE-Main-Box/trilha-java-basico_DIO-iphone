package services.media_service.base_models;

import services.media_service.model.base_model.Media;

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
