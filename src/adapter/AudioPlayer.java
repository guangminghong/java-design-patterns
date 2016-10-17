package adapter;

/**
 * Created by finley on 17/10/16.
 */
public class AudioPlayer implements MediaPlayer{
    MediaAdapter mediaAdapter;


    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")) {//内置mp3播放器
            System.out.println("Playing mp3 file. Name: " + fileName);
        } else if(audioType.equalsIgnoreCase("vlc")|| audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invald media. " + audioType + " format not support!");
        }
    }
}
