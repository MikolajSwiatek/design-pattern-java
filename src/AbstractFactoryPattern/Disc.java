package AbstractFactoryPattern;

public abstract class Disc {
    protected String name;
    protected int size;

    public Disc(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Disc{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
