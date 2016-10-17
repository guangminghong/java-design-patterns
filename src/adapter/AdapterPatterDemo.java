package adapter;

/**
 * Created by finley on 17/10/16.
 */
public class AdapterPatterDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3","beyond the horizon.mp3");
        audioPlayer.play("mp4", "alnoe.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
    }
}
