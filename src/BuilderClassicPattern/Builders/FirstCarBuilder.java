package BuilderClassicPattern.Builders;

import BuilderClassicPattern.Entities.Car;
import BuilderClassicPattern.Entities.Driver;
import BuilderClassicPattern.Entities.Engine;

public class FirstCarBuilder implements CarBuilder {
    private Car car;

    public FirstCarBuilder() {
        this.car = new Car();
        this.car.setName("FirstCar");
    }

    @Override
    public void driver() {
        Driver driver  = new Driver("First", 24);
        this.car.setDriver(driver);
    }

    @Override
    public void engine() {
        Engine engine = new Engine("forFirstCar");
        this.car.setEngine(engine);
    }

    @Override
    public Car build() {
        return car;
    }
}
