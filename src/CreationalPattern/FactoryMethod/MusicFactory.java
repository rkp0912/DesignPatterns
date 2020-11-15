package CreationalPattern.FactoryMethod;

public class MusicFactory {
    public static Music getMusic(String sound){
        if(sound.equals("Indian Classical"))
            return new IndianClassical();
        else if(sound.equals("Symphony"))
            return new Symphony();
        return null;
    }
}
