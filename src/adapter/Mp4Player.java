package adapter;

/**
 * Created by finley on 17/10/16.
 */
public class Mp4Player implements AdvanceMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileNmae) {
        System.out.println("Playing mp4 file. Name: " + fileNmae);
    }
}
