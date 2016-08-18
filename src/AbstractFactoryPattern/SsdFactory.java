package AbstractFactoryPattern;

public class SsdFactory extends DiscFactory implements DiscAbstractFactory {
    public SsdFactory(String name, int size) {
        super(name, size);
    }

    @Override
    public Disc makeDisc() {
        return new Ssd(this.name, this.size);
    }
}
