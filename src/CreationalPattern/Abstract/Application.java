package CreationalPattern.Abstract;

public class Application {

    private Button button;
    private CheckBox checkBox;

    public Application(GUIFactory guiFactory){
        button = guiFactory.createButton();
        checkBox = guiFactory.createCheckBox();
    }

    public void paint(){
        button.Paint();
        checkBox.paint();
    }
}
