package BridgePattern;

public abstract class RTV implements Device {
    protected String status;
    protected String name;

    public RTV() {
        this.status = "RTV";
        this.status = "off";
    }

    @Override
    public void on() {
        this.status = "on";
    }

    @Override
    public void off() {
        this.status = "off";
    }

    @Override
    public String getStatus() {
        return "RTV: " + status;
    }
}
