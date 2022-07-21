public class AudioPlayer implements MediaPlayer {

    @Override
    public void reproduzir(TipoMedia tipoMedia, String nome) {
        if (tipoMedia == TipoMedia.MP3) {
            System.out.print("Reproduzindo MP3: " + nome);
        } else {
            MediaPlayerAdapter adapter = new MediaPlayerAdapter(tipoMedia);
            adapter.reproduzir(tipoMedia, nome);
        }
    }
}
