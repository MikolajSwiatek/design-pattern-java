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

        Assert.assertTrue(1 == t.getCost());
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

        Assert.assertTrue(1.5 == t.getCost());
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

        Assert.assertTrue(2.5 == t.getCost());
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

        Assert.assertTrue(3 == t.getCost());
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

        Assert.assertTrue(3 == t.getCost());
    }
}
