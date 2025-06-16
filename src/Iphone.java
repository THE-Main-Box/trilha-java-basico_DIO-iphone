import media_models.model.Music;
import media_models.model.Video;
import service_models.base_model.BaseMusicPlayer;
import service_models.base_model.BaseVideoPlayer;

public class Iphone {

    public static void main(String[] args) {
        testMediaPlayers();

    }

    private static void testMediaPlayers(){
        BaseVideoPlayer videoPlayer = new BaseVideoPlayer();
        BaseMusicPlayer musicPlayer = new BaseMusicPlayer();

        musicPlayer.addMusic(new Music("centuries_falloutboys", "t/path"));

        videoPlayer.addVideo(new Video("indiecrosspart1_moro", "t/path"));

        musicPlayer.selectMusic("centuries_falloutboys");

        musicPlayer.play();
        musicPlayer.pause();
    }
}