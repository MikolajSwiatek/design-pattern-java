package BridgePattern;

public abstract class RTV implements Device {
    protected String status;
    protected String name;

    public RTV() {
        this.name = "RTV";
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

    @Override
    public String toString() {
        return "RTV{" +
                "status='" + status + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
