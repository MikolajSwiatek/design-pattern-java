package SingletonPattern;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SingletonTests {
    private MySingleton singleton;
    private MySingleton singleton2;

    @Before
    public void setSingleton() {
        singleton = MySingleton.getInstance();
    }

    @Test
    public void checkSingletonNameValues() {
        setNameAndValue(singleton, "name_1", "value_1");
        singleton2 = MySingleton.getInstance();
        setNameAndValue(singleton2, "name_2", "value_2");
        assertEquals(true, singleton.getName().equals(singleton2.getName()));
    }

    @Test
    public void checkSingletonValueValues() {
        setNameAndValue(singleton, "name_1", "value_1");
        singleton2 = MySingleton.getInstance();
        setNameAndValue(singleton2, "name_2", "value_2");
        assertEquals(true, singleton.getValue().equals(singleton2.getValue()));
    }

    private void setNameAndValue(MySingleton s, String name, String value) {
        s.setName(name);
        s.setValue(value);
    }
}
