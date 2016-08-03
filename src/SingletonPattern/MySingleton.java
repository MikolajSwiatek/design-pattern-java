package SingletonPattern;

public class MySingleton {
    private static MySingleton instance;

    private String name;
    private String value;

    public static MySingleton getInstance() {
        if (instance == null) {
            instance = new MySingleton();
        }

        return instance;
    }

    private  MySingleton() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
