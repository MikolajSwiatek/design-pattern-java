package BuilderClassicPattern.Entities;

public class Car {
    private Driver driver;
    private Engine engine;
    private String name;

    public Car() {}

    public Car(Driver driver, Engine engine, String name) {
        this.driver = driver;
        this.engine = engine;
        this.name = name;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "driver=" + driver +
                ", engine=" + engine +
                ", name='" + name + '\'' +
                '}';
    }
}
