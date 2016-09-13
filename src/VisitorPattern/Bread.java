package VisitorPattern;

public class Bread implements Visitable {
    private double cost;
    private String type;

    public Bread(double cost, String type) {
        this.cost = cost;
        this.type = type;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Bread{" +
                "cost=" + cost +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.add(this);
    }
}
