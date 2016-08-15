package DecoratorPattern;

import org.junit.Assert;
import org.junit.Test;

public class TeaDecoratorTests {

    @Test
    public void SimpleTeaFromTest() {
        Tea t = new SimpleTea();

        Assert.assertTrue(t.getFrom().equals("SimpleTea"));
    }

    @Test
    public void SimpleTeaCostTest() {
        Tea t = new SimpleTea();

        Assert.assertTrue(t.getCost() == 1);
    }

    @Test
    public void TeaWithSugarFromTest() {
        Tea t = new SimpleTea();
        t = new TeaWithSugarDecorator(t);

        Assert.assertTrue(t.getFrom().equals("SimpleTea, with sugar"));
    }

    @Test
    public void TeaWithSugarCostTest() {
        Tea t = new SimpleTea();
        t = new TeaWithSugarDecorator(t);

        Assert.assertTrue(t.getCost() == 1.5);
    }

    @Test
    public void TeaWithLemonFromTest() {
        Tea t = new SimpleTea();
        t = new TeaWithLemonDecorator(t);

        Assert.assertTrue(t.getFrom().equals("SimpleTea, with lemon"));
    }

    @Test
    public void TeaWithLemonCostTest() {
        Tea t = new SimpleTea();
        t = new TeaWithLemonDecorator(t);

        Assert.assertTrue(t.getCost() == 2.5);
    }

    @Test
    public void TeaWithSugarAndLemonFromTest() {
        Tea t = new SimpleTea();
        t = new TeaWithSugarDecorator(t);
        t = new TeaWithLemonDecorator(t);

        Assert.assertTrue(t.getFrom().equals("SimpleTea, with sugar, with lemon"));
    }

    @Test
    public void TeaWithSugarAndLemonCostTest() {
        Tea t = new SimpleTea();
        t = new TeaWithSugarDecorator(t);
        t = new TeaWithLemonDecorator(t);

        Assert.assertTrue(t.getCost() == 3);
    }

    @Test
    public void TeaWithLemonAndSugarFromTest() {
        Tea t = new SimpleTea();
        t = new TeaWithLemonDecorator(t);
        t = new TeaWithSugarDecorator(t);

        Assert.assertTrue(t.getFrom().equals("SimpleTea, with lemon, with sugar"));
    }

    @Test
    public void TeaWithLemonAndSugarCostTest() {
        Tea t = new SimpleTea();
        t = new TeaWithLemonDecorator(t);
        t = new TeaWithSugarDecorator(t);

        Assert.assertTrue(t.getCost() == 3);
    }
}
