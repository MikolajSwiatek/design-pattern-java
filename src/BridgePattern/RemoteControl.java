package BridgePattern;

public class RemoteControl {
    private Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void turnOff() {
        this.device.off();
    }

    public void turnOn() {
        this.device.on();
    }

    public String checkStatus() {
        return this.device.getStatus();
    }

    @Override
    public String toString() {
        return "RemoteControl{" +
                "device=" + device.toString() +
                '}';
    }
}
