package BridgePattern;

public class  Main {
    public static void main(String[] args){
        RemoteControl tvController = new RemoteControl(new TV());
        RemoteControl pcController = new RemoteControl(new PC());

        System.out.println(tvController.checkStatus());
        System.out.println(tvController.toString());

        tvController.turnOn();
        System.out.println(tvController.checkStatus());
        System.out.println(tvController.toString());

        tvController.turnOff();
        System.out.println(tvController.checkStatus());
        System.out.println(tvController.toString());

        System.out.println(pcController.checkStatus());
        System.out.println(pcController.toString());

        pcController.turnOn();
        System.out.println(pcController.checkStatus());
        System.out.println(pcController.toString());

        pcController.turnOff();
        System.out.println(pcController.checkStatus());
        System.out.println(pcController.toString());
    }
}
