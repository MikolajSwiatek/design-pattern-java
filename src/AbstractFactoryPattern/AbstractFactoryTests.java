package AbstractFactoryPattern;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AbstractFactoryTests {
    private Disc hdd;
    private Disc ssd;

    @Before
    public void setUp() {
        hdd = DiscBuilder.getDisc(new HddFactory("A", 8));
        ssd = DiscBuilder.getDisc(new SsdFactory("B", 8));
    }

    @Test
    public void checkHddClassName() {
        assertTrue(hdd instanceof Hdd);
    }

    @Test
    public void checkSsdClassName() {
        assertTrue(ssd instanceof Ssd);
    }

    @Test
    public void checkHddType() {
        assertEquals(hdd.getType(), "HDD");
    }

    @Test
    public void checkSsdType() {
        assertEquals(ssd.getType(), "SSD");
    }
}
