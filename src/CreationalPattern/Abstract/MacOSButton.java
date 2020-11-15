package CreationalPattern.Abstract;

public class MacOSButton implements Button {
    @Override
    public void Paint() {
        System.out.println("You have Created MacOSButton.");
    }
}
