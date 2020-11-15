package CreationalPattern.Abstract;

public class AbstractDemo {

    public static void main(String[] args){
        Application app = configureApplication();
        app.paint();
    }

    private static Application configureApplication(){
        Application application;
        GUIFactory guiFactory;

        String osName = System.getProperty("os.name").toLowerCase();
        if(osName.contains("mac")){
            guiFactory = new MacOSFactory();
            application  = new Application(guiFactory);
        } else {
            guiFactory = new WindowsFactory();
            application = new Application(guiFactory);
        }

        return application;
    }
}
