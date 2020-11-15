package CreationalPattern.Abstract;

public class WindowsButton implements Button {
    @Override
    public void Paint() {
        System.out.println("You have created WindowsButton.");
    }
}
