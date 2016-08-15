package DecoratorPattern;

public class Main {
    public static void main (String[] args) {
        Tea t = new SimpleTea();
        Tea t2 = new SimpleTea();

        printInfo(t, 1);
        printInfo(t2, 2);

        t = new TeaWithLemonDecorator(t);
        t2 = new TeaWithSugarDecorator(t2);

        printInfo(t, 1);
        printInfo(t2, 2);

        t = new TeaWithSugarDecorator(t);
        t2 = new TeaWithLemonDecorator(t2);

        printInfo(t, 1);
        printInfo(t2, 2);
    }

    private static void printInfo(Tea t, int  index) {
        System.out.println("Tea #" + index + ": Cost: " + t.getCost() + ", from: " + t.getFrom());
    }
}
