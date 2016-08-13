package BuilderClassicPattern.Builders;

import BuilderClassicPattern.Entities.Car;
import BuilderClassicPattern.Entities.Driver;
import BuilderClassicPattern.Entities.Engine;

public class SecondCarBuilder implements CarBuilder {
    private Car car;

    public SecondCarBuilder() {
        this.car = new Car();
        this.car.setName("SecondCar");
    }

    @Override
    public void driver() {
        Driver driver  = new Driver("Second", 20);
        this.car.setDriver(driver);
    }

    @Override
    public void engine() {
        Engine engine = new Engine("forSecondCar");
        this.car.setEngine(engine);
    }

    @Override
    public Car build() {
        return car;
    }
}
