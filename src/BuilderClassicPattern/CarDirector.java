package BuilderClassicPattern;

import BuilderClassicPattern.Builders.CarBuilder;
import BuilderClassicPattern.Entities.Car;

public class CarDirector {
    private CarBuilder carBuilder;

    public CarDirector(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public void makeCar(){
        carBuilder.engine();
        carBuilder.driver();
    }

    public Car getCar(){
        return this.carBuilder.build();
    }
}
