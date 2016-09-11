package ValueObjectPattern;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ValueObjectTests {
    Student studentA;
    Student studentB;
    Student studentC;

    @Before
    public void setUp() {
        studentA = Student.valueOf("A", "12345", 20);
        studentB = Student.valueOf("A", "12345", 20);
        studentC = Student.valueOf("C", "12346", 21);
    }

    @Test
    public void whenEquals_ShouldReturnTrue() {
        Assert.assertEquals(studentA, studentB);
    }

    @Test
    public void whenEquals_ShouldReturnFalse() {
        Assert.assertNotSame(studentA, studentC);
        Assert.assertNotSame(studentB, studentC);
    }
}
