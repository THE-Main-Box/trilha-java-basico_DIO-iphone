package services.media_service.model.base_model;

public abstract class Media {
    protected String title;
    protected String path;

    protected boolean playing;

    public Media(String title, String path) {
        this.title = title;
        this.path = path;

        this.playing = false;
    }

    public String getPath() {
        return path;
    }

    public String getTitle() {
        return title;
    }

    public void play(){
        this.playing = true;
    }
    public void pause(){
        this.playing = false;
    }
}
