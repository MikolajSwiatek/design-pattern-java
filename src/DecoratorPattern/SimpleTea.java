package DecoratorPattern;

public class SimpleTea implements Tea {
    @Override
    public double getCost() {
        return 1 ;
    }

    @Override
    public String getFrom() {
        return "SimpleTea";
    }
}
