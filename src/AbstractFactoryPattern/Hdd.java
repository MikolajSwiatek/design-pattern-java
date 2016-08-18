package AbstractFactoryPattern;

public class Hdd extends Disc {
    public Hdd(String name, int size) {
        super(name, size);
    }

    @Override
    public String toString() {
        return "Hdd{}";
    }
}
