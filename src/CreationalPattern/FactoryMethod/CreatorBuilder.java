package CreationalPattern.FactoryMethod;

public class CreatorBuilder {
    public static void main(String[] args){
        Music m = MusicFactory.getMusic("Indian Classical");
        m.hearSound();

        m = MusicFactory.getMusic("Symphony");
        m.hearSound();
    }
}
