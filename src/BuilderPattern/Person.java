package BuilderPattern;

public class Person {
    private final String name;
    private final String surname;
    private final boolean isMan;
    private final int age;
    private final String pesel;
    private final String adress;
    private final String zipCode;
    private final String city;
    private final String state;
    private final String country;

    public Person() {
        name = null;
        surname = null;
        isMan = false;
        age = 0;
        pesel = null;
        adress = null;
        zipCode = null;
        city = null;
        state = null;
        country = null;
    }

    public Person(
            String name,
            String surname,
            boolean isMan,
            int age,
            String pesel,
            String adress,
            String zipCode,
            String city,
            String state,
            String country) {
        this.name = name;
        this.surname = surname;
        this.isMan = isMan;
        this.age = age;
        this.pesel = pesel;
        this.adress = adress;
        this.zipCode = zipCode;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public boolean isMan() {
        return isMan;
    }

    public int getAge() {
        return age;
    }

    public String getPesel() {
        return pesel;
    }

    public String getAdress() {
        return adress;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", isMan=" + isMan +
                ", age=" + age +
                ", pesel='" + pesel + '\'' +
                ", adress='" + adress + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public static class StaticPersonBuilder {
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

        public StaticPersonBuilder() {
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

        public StaticPersonBuilder name(String name) {
            this.name = name;
            return this;
        }

        public StaticPersonBuilder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public StaticPersonBuilder isMan(boolean isMan) {
            this.isMan = isMan;
            return this;
        }

        public StaticPersonBuilder age(int age) {
            this.age = age;
            return this;
        }

        public StaticPersonBuilder pesel(String pesel) {
            this.pesel = pesel;
            return this;
        }

        public StaticPersonBuilder adress(String adress) {
            this.adress = adress;
            return this;
        }

        public StaticPersonBuilder zipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }

        public StaticPersonBuilder city(String city) {
            this.city = city;
            return this;
        }

        public StaticPersonBuilder state(String state) {
            this.state = state;
            return this;
        }

        public StaticPersonBuilder country(String country) {
            this.country = country;
            return this;
        }
    }

}
