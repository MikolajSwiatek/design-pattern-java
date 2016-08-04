package PrototypePattern;

public class Main {
    public static void main (String[] args) {
        PrintHumans();
    }

    public static void PrintHumans() {
        try {
            HumanRegistry humanRegistry = new HumanRegistry();

            Human boy = humanRegistry.createBasicHuman("M");
            Human girl = humanRegistry.createBasicHuman("A");

            System.out.println(boy);
            System.out.println(girl);
        }
        catch (HumanToCloneNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
