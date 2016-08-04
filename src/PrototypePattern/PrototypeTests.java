package PrototypePattern;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PrototypeTests {
    HumanRegistry humanRegistry;
    Human human;

    @Before
    public void setGirl() {
        humanRegistry = new HumanRegistry();
    }

    @Test
    public void shouldReturnGirlClass() throws HumanToCloneNotFoundException{
        human = humanRegistry.createBasicHuman("A");

        assertTrue(human.getClass().getSimpleName().equals("Girl"));
    }

    @Test
    public void shouldReturnBoyClass() throws HumanToCloneNotFoundException{
        human = humanRegistry.createBasicHuman("M");

        assertTrue(human.getClass().getSimpleName().equals("Boy"));
    }

    @Test
    public void shouldReturnCorrectValuesForGirl() throws HumanToCloneNotFoundException{
        human = humanRegistry.createBasicHuman("A");

        assertTrue(human.getName().equals("A"));
        assertTrue(human.getAge() == 20);
    }

    @Test(expected = HumanToCloneNotFoundException.class)
    public void shouldReturnExceptionWhenHumanWithNameNotExist() throws HumanToCloneNotFoundException{
        human = humanRegistry.createBasicHuman("E");
    }
}
