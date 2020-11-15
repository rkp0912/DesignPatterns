package CreationalPattern.Builder.Example1;

public class GPSNavigator {
    private String route;

    public GPSNavigator() {
        this.route = "Richmond Road, Bangalore";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute(){
        return route;
    }
}
