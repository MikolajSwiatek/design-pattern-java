package BridgePattern;

public class PC extends RTV {
    public PC() {
        super();
        super.name = "PC";
    }

    @Override
    public String getStatus() {
        return "PC: " + status;
    }
}
