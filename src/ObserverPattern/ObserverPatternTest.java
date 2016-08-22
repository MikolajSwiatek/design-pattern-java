package ObserverPattern;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ObserverPatternTest {
    private ProductSubject subject;

    @Before
    public void setUp() {
        subject = new ProductSubject("A1", "T!", false);
    }

    @Test
    public void WhenAddedClientToProductShouldReturnCorrectLength() {
        ClientObserver client1 = new ClientObserver("C1", null);
        ClientObserver client2 = new ClientObserver("C2", null);

        subject.register(client1);
        subject.register(client2);

        assertTrue(subject.getObservers().size() == 2);
    }

    @Test
    public void WhenRemovedClientFromProductShouldReturnCorrectLength() {
        ClientObserver client1 = new ClientObserver("C1", null);
        ClientObserver client2 = new ClientObserver("C2", null);

        subject.register(client1);
        subject.register(client2);

        subject.unregister(client1);
        subject.unregister(client2);

        assertTrue(subject.getObservers().size() == 0);
    }

    @Test
    public void WhenProductChangeExistStatustShouldReturnCorrectLength() {
        ClientObserver client1 = new ClientObserver("C1", null);

        subject.register(client1);
        subject.setIsExist(true);

        assertTrue(client1.getLastUpdated() != null);
    }
}
