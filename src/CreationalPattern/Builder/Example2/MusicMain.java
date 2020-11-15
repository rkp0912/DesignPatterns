package CreationalPattern.Builder.Example2;

public class MusicMain {
    public static void main(String[] args){
        Music song = new Music.MusicBuilder().addGuitar().addDrum().addPiano().build();
        System.out.println(song.toString());
        song = new Music.MusicBuilder().build();
        System.out.println(song.toString());
    }
}
