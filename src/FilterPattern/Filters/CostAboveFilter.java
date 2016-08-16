package FilterPattern.Filters;

import FilterPattern.Car;
import FilterPattern.CarFilterResult;
import FilterPattern.Criteria;

import java.util.ArrayList;
import java.util.List;

public class CostAboveFilter implements Criteria<Car, Integer> {
    @Override
    public CarFilterResult<Integer> getByFilter(List<Car> cars, Integer parameter) {
        List<Car> filterCar = new ArrayList<>();

        for (Car car : cars) {
            if (car.getCost() > parameter) {
                filterCar.add(car);
            }
        }

        return new CarFilterResult<Integer>(parameter, filterCar);
    }
}
