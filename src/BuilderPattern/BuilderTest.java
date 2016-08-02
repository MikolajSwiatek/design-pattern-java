package BuilderPattern;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BuilderTest {
    private Person person1;
    private Person person2;
    private Person person3;

    @Before
    public void setPerons() {
        person1 = new Person(
                "Name",
                "Surname",
                true,
                18,
                "12345678900",
                "Street",
                "Zip-Code",
                "City",
                "State",
                "Poland");

        person2 = new Person.StaticPersonBuilder()
                .name("Name")
                .surname("Surname")
                .isMan(true)
                .age(18)
                .pesel("12345678900")
                .adress("Street")
                .city("City")
                .zipCode("Zip-Code")
                .state("State")
                .country("Poland")
                .build();

         person3 = new PersonBuilder()
                .name("Name")
                .surname("Surname")
                .isMan(true)
                .age(18)
                .pesel("12345678900")
                .adress("Street")
                .city("City")
                .zipCode("Zip-Code")
                .state("State")
                .country("Poland")
                .build();
    }

    @Test
    public void checkPersonClassWithStaticPersonBuilder() {
        assertEquals(person1.toString(), person2.toString());
    }

    @Test
    public void checkPersonClassWithPersonBuilder() {
        assertEquals(person1.toString(), person3.toString());
    }

    @Test
    public void checkStaticPersonBuilderClassWithPersonBuilder() {
        assertEquals(person2.toString(), person3.toString());
    }
}
