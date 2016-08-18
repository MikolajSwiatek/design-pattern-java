package AbstractFactoryPattern;

public abstract class DiscFactory {
    protected String name;
    protected int size;

    public DiscFactory(String name, int size) {
        this.name = name;
        this.size = size;
    }
}
