package DecoratorPattern;

public class TeaDecorator implements Tea {
    protected final Tea tea;

    public TeaDecorator(Tea tea) {
        this.tea = tea;
    }

    @Override
    public double getCost() {
        return tea.getCost();
    }

    @Override
    public String getFrom() {
        return tea.getFrom();
    }
}
