package FilterPattern;

import java.util.List;

public class CarFilterResult<T> {
    private T parameter;
    private List<Car> cars;

    public CarFilterResult(T parameter, List<Car> cars) {
        this.parameter = parameter;
        this.cars = cars;
    }

    public T getParameter() {
        return parameter;
    }

    public List<Car> getCars() {
        return cars;
    }
}
