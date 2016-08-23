package FactoryMethodPattern;

public class Male extends Genre {
    @Override
    public String getName() {
        this.name = "male";
        return this.name;
    }
}
