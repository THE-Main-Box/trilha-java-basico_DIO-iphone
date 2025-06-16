package media_models.model;

import media_models.base_model.Media;

public class Video extends Media {
    public Video(String title, String path) {
        super(title, path);
    }

    @Override
    public void play() {
        if(this.playing) {
            System.out.println("Já estamos tocando o video " + title);
        } else {
            System.out.println("Tocando video " + title);
        }

        super.play();
    }

    @Override
    public void pause() {
        if(!this.playing) {
            System.out.println("video já pausado " + title);
        } else {
            System.out.println("Pausando video "+ title);
        }

        super.pause();
    }
}
