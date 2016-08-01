package BuilderPattern;

public class PersonBuilder {
    private String name;
    private String surname;
    private boolean isMan;
    private int age;
    private String pesel;
    private String adress;
    private String zipCode;
    private String city;
    private String state;
    private String country;

    public PersonBuilder() {
    }

    public Person build() {
        return new Person(
                this.name,
                this.surname,
                this.isMan,
                this.age,
                this.pesel,
                this.adress,
                this.zipCode,
                this.city,
                this.state,
                this.country);
    }

    public PersonBuilder name(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder surname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder isMan(boolean isMan) {
        this.isMan = isMan;
        return this;
    }

    public PersonBuilder age(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder pesel(String pesel) {
        this.pesel = pesel;
        return this;
    }

    public PersonBuilder adress(String adress) {
        this.adress = adress;
        return this;
    }

    public PersonBuilder zipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    public PersonBuilder city(String city) {
        this.city = city;
        return this;
    }

    public PersonBuilder state(String state) {
        this.state = state;
        return this;
    }

    public PersonBuilder country(String country) {
        this.country = country;
        return this;
    }
}
