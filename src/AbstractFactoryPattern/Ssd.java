package AbstractFactoryPattern;

public class Ssd extends Disc {
    public Ssd(String name, int size) {
        super(name, size);
        this.type = "SSD";
    }

    @Override
    public String toString() {
        return "Ssd{}";
    }
}
