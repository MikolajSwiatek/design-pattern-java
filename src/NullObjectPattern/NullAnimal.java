package NullObjectPattern;

public class NullAnimal extends Animal {
    public NullAnimal() {
        this.name = null;
    }

    @Override
    public String getSound() {
        return null;
    }
}
