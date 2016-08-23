package FactoryMethodPattern;

public class GenreFactory {
    public static Genre create(GenreType type) {
        if (type == GenreType.FEMALE) {
            return new Female();
        }
        else if (type == GenreType.MALE) {
            return new Male();
        }

        throw new IllegalArgumentException();
    }
}
