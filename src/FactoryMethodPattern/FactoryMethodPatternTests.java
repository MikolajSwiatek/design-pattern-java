package FactoryMethodPattern;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FactoryMethodPatternTests {
    @Test
    public void MaleGenreShouldReturnCorrectValues() {
        Genre male = GenreFactory.create(GenreType.MALE);

        male.setName("male");

        assertTrue(male.toString().equals("Genre{name='male'}"));
        assertEquals(male.getClass().getSimpleName(), "Male");
    }

    @Test
    public void FemaleGenreShouldReturnCorrectValues() {
        Genre female = GenreFactory.create(GenreType.FEMALE);

        female.setName("female");

        assertTrue(female.toString().equals("Genre{name='female'}"));
        assertEquals(female.getClass().getSimpleName(), "Female");
    }
}
