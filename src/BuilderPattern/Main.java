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
                "Zip-Code",
                "City",
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

        Person person3 = new PersonBuilder()
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

        printlnPersons(person, person2, person3);
    }

    private static void printlnPersons(Person person, Person person2, Person person3) {
         System.out.println(person);
         System.out.println(person2);
         System.out.println(person3);
    }
}