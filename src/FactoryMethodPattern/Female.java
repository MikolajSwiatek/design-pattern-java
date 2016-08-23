package FactoryMethodPattern;

public class Female extends Genre {
    @Override
    public String getName() {
        this.name = "female";
        return this.name;
    }
}
