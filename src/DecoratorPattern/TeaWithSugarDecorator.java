package DecoratorPattern;

public class TeaWithSugarDecorator extends TeaDecorator {
    public TeaWithSugarDecorator(Tea tea) {
        super(tea);
    }

    public double getCost() {
        return tea.getCost() + 0.5;
    }

    public String getFrom() {
        return tea.getFrom() + ", with sugar";
    }
}
