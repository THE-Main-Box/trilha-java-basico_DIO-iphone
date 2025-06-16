import media_models.model.Music;
import media_models.model.Video;
import services.call_service.Call;
import services.call_service.Contact;
import services.media_service.base_models.BaseMusicPlayer;
import services.media_service.base_models.BaseVideoPlayer;

public class Iphone {

    public static void main(String[] args) {
        testMediaPlayers();
        System.out.println("//-//-//-//-//-//-//-//-///-//");
        testCallSystem();
    }

    private static void testCallSystem(){
        Contact alice = new Contact("12345", "Alice");
        Contact bob = new Contact("67890", "Bob");

        Call call = new Call(alice, bob);
        call.startCall(); // Alice chama Bob
        call.rejectCall(); // Bob atende
        call.endCall(); // Ligação finaliza
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