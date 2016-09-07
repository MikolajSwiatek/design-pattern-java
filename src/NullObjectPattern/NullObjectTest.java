package NullObjectPattern;

import org.junit.Test;

import static org.junit.Assert.*;

public class NullObjectTest {
    @Test
    public void GirlSoundTest() {
        Animal girl = new Girl();

        assertTrue(girl.getSound().equals("Shopping!"));
    }

    @Test
    public void GirlNameTest() {
        Animal girl = new Girl();

        assertTrue(girl.getName().equals("Girl"));
    }

    @Test
    public void NullSoundTest() {
        Animal nullAnimal = new NullAnimal();

        assertTrue(null == nullAnimal.getSound());
    }

    @Test
    public void NullNameTest() {
        Animal nullAnimal = new NullAnimal();

        assertTrue(nullAnimal.getName() == null);
    }
}
