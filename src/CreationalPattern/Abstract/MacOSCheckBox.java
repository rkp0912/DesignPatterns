package CreationalPattern.Abstract;

public class MacOSCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckBox.");
    }
}
