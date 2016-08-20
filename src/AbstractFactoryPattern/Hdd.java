package AbstractFactoryPattern;

public class Hdd extends Disc {
    public Hdd(String name, int size) {
        super(name, size);
        this.type = "HDD";
    }

    @Override
    public String toString() {
        return "Hdd{}";
    }
}
