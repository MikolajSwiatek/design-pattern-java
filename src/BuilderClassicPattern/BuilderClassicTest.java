package BuilderClassicPattern;

import BuilderClassicPattern.Builders.CarBuilder;
import BuilderClassicPattern.Builders.FirstCarBuilder;
import BuilderClassicPattern.Builders.SecondCarBuilder;
import BuilderClassicPattern.Entities.Car;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BuilderClassicTest {
    Car firstCar;
    Car secondCar;

    @Before
    public void SetUp() {
        CarBuilder firstCarBuilder = new FirstCarBuilder();
        CarBuilder secondCarBuilder = new SecondCarBuilder();

        CarDirector firstCarDirector = new CarDirector(firstCarBuilder);
        CarDirector secondtCarDirector = new CarDirector(secondCarBuilder);

        firstCarDirector.makeCar();
        secondtCarDirector.makeCar();

        firstCar = firstCarDirector.getCar();
        secondCar = secondtCarDirector.getCar();
    }

    @Test
    public void FirstCarTest() {
        Assert.assertTrue(firstCar != secondCar);
        Assert.assertTrue(firstCar.getName().equals("FirstCar"));
        Assert.assertTrue(firstCar.getDriver().getAge() == 24);
        Assert.assertTrue(firstCar.getDriver().getName().equals("First"));
        Assert.assertTrue(firstCar.getEngine().getType().equals("forFirstCar"));
    }

    @Test
    public void SecondtCarTest() {
        Assert.assertTrue(secondCar != firstCar);
        Assert.assertTrue(secondCar.getName().equals("SecondCar"));
        Assert.assertTrue(secondCar.getDriver().getAge() == 20);
        Assert.assertTrue(secondCar.getDriver().getName().equals("Second"));
        Assert.assertTrue(secondCar.getEngine().getType().equals("forSecondCar"));
    }
}
