package FactoryMethodPattern;

public class Main {
    public static void main (String[] args) {
        Genre male = GenreFactory.create(GenreType.MALE);
        Genre female = GenreFactory.create(GenreType.FEMALE);

        male.setName("male");
        female.setName("female");

        System.out.println(male);
        System.out.println(female);
    }
}
