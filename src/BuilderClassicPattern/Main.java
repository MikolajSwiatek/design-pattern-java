package BuilderClassicPattern;

import BuilderClassicPattern.Builders.CarBuilder;
import BuilderClassicPattern.Builders.FirstCarBuilder;
import BuilderClassicPattern.Builders.SecondCarBuilder;
import BuilderClassicPattern.Entities.Car;

public class Main {
    public static void main (String[] args) {
        CarBuilder firstCarBuilder = new FirstCarBuilder();
        CarBuilder secondCarBuilder = new SecondCarBuilder();

        CarDirector firstCarDirector = new CarDirector(firstCarBuilder);
        CarDirector secondtCarDirector = new CarDirector(secondCarBuilder);

        firstCarDirector.makeCar();
        secondtCarDirector.makeCar();

        Car firstCar = firstCarDirector.getCar();
        Car secondCar = secondtCarDirector.getCar();

        System.out.println(firstCar);
        System.out.println(secondCar);
    }
}
