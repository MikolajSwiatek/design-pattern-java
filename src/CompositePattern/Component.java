package CompositePattern;

public abstract class Component {
    protected String name;

    public abstract void addChild(Component component);
    public abstract void removeChild(Component component);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
