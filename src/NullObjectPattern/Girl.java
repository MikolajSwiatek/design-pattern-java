package NullObjectPattern;

public class Girl extends Animal {
    public Girl() {
        this.name = "Girl";
    }



    @Override
    public String getSound() {
        return "Shopping!";
    }
}
