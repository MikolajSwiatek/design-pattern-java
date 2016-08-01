package BuilderPattern;

public class Main {
    public static void main (String[] args) {
        Person person = new Person(
                "Name",
                "Surname",
                true,
                18,
                "12345678900",
                "Street",
                "City"
                "Zip-Code",
                "State",
                "Poland");

        Person person2 = new Person.StaticPersonBuilder()
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
}
