package FilterPattern.Filters;

import FilterPattern.Car;
import FilterPattern.CarFilterResult;
import FilterPattern.Criteria;

import java.util.ArrayList;
import java.util.List;

public class NameFilter implements Criteria<Car, String> {
    @Override
    public CarFilterResult<String> getByFilter(List<Car> cars, String parameter) {
        List<Car> filterCar = new ArrayList<>();

        for (Car car : cars) {
            if (car.getName().contains(parameter)) {
                filterCar.add(car);
            }
        }

        return new CarFilterResult<String>(parameter, filterCar);
    }
}
