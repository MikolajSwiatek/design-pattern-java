package VisitorPattern;

public class Roll implements Visitable {
    private double cost;

    public Roll(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Roll{" +
                "cost=" + cost +
                '}';
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.add(this);
    }
}
