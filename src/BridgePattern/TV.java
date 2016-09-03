package BridgePattern;

public class TV extends RTV {
    public TV() {
        super();
        super.name = "TV";
    }

    @Override
    public String getStatus() {
        return "TV: " + status;
    }
}
