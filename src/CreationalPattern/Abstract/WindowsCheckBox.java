package CreationalPattern.Abstract;

public class WindowsCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckBox.");
    }
}
