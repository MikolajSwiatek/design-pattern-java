package AbstractFactoryPattern;

public class HddFactory extends DiscFactory implements DiscAbstractFactory {
    public HddFactory(String name, int size) {
        super(name, size);
    }

    @Override
    public Disc makeDisc() {
        return new Hdd(this.name, this.size);
    }
}
