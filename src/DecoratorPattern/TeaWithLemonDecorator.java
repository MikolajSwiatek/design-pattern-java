package DecoratorPattern;

public class TeaWithLemonDecorator extends TeaDecorator {
    public TeaWithLemonDecorator(Tea tea) {
        super(tea);
    }

    public double getCost() {
        return tea.getCost() + 1.5;
    }

    public String getFrom() {
        return tea.getFrom() + ", with lemon";
    }
}
