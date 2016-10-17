package adapter;


/**
 * Created by finley on 17/10/16.
 */
public class VlcPlayer implements AdvanceMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name : " + fileName);
    }

    @Override
    public void playMp4(String fileNmae) {
    }
}
