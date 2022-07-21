public class VideoMediaPlayer implements AdvancedMediaPlayer {

    @Override
    public void reproduzirVlc(String vlc) {
        System.out.print("Reproduzindo VLC: " + vlc);
    }

    @Override
    public void reproduzirMp4(String mp4) {
        System.out.print("Reproduzindo MP4: " + mp4);
    }
}
