package BuilderClassicPattern.Builders;

import BuilderClassicPattern.Entities.Car;

public interface CarBuilder {
    public void driver();
    public void engine();
    public Car build();
}
