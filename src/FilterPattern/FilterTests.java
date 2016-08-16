package FilterPattern;

import FilterPattern.Filters.CostAboveFilter;
import FilterPattern.Filters.CostBelowFilter;
import FilterPattern.Filters.CountryFilter;
import FilterPattern.Filters.NameFilter;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FilterTests {
    private List<Car> cars;

    @Before
    public void setUp() {
        cars = new ArrayList<>();
        cars.add(new Car("Audi", 10, "DE"));
        cars.add(new Car("Audi2", 100, "DE"));
        cars.add(new Car("AA", 10, "AA"));
        cars.add(new Car("BB", 5, "AA"));
        cars.add(new Car("AA234", 120, "EE"));
        cars.add(new Car("A$$%@A", 102, "GG"));
        cars.add(new Car("AgegeA", 130, "AA"));
        cars.add(new Car("AewgewA", 120, "AA"));
        cars.add(new Car("AgwewgA", 140, "AA"));
    }

    @Test
    public void filterByCostAbove() {
        Criteria<Car, Integer> filter = new CostAboveFilter();
        CarFilterResult<Integer> results = filter.getByFilter(cars, 5);

        Assert.assertTrue(5 == results.getParameter());
        Assert.assertEquals(8, results.getCars().size());
    }

    @Test
    public void filterByCostBelow() {
        Criteria<Car, Integer> filter = new CostBelowFilter();
        CarFilterResult<Integer> results = filter.getByFilter(cars, 135);

        Assert.assertTrue(135 == results.getParameter());
        Assert.assertEquals(8, results.getCars().size());
    }

    @Test
    public void filterByCountry() {
        Criteria<Car, String> filter = new CountryFilter();
        CarFilterResult<String> results = filter.getByFilter(cars, "EE");

        Assert.assertEquals("EE", results.getParameter());
        Assert.assertEquals(1, results.getCars().size());
    }

    @Test
    public void filterByName() {
        Criteria<Car, String> filter = new NameFilter();
        CarFilterResult<String> results = filter.getByFilter(cars, "Audi");

        Assert.assertEquals("Audi", results.getParameter());
        Assert.assertEquals(2, results.getCars().size());
    }
}
