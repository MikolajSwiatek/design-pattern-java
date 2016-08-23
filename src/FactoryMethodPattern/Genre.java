package FactoryMethodPattern;

public abstract class Genre {
    protected String name;

    public abstract String getName();

    public void setName(String name) {
        this.name = name;
    }
}
