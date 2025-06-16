package media_models.model;

import media_models.base_model.Media;

public class Music extends Media {
    public Music(String title, String path) {
        super(title, path);
    }

    @Override
    public void play() {
        if(this.playing) {
            System.out.println("Já estamos tocando a música "+ title);
        } else {
            System.out.println("Tocando música "+ title);
        }

        super.play();
    }

    @Override
    public void pause() {
        if(!this.playing) {
            System.out.println("Musica já pausada "+ title);
        } else {
            System.out.println("Pausando Musica "+ title);
        }

        super.pause();
    }
}
