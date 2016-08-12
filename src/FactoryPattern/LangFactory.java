package FactoryPattern;

public class LangFactory {
    public static Lang buildLang(String name) {
        Lang lang = null;

        if (name.equals("Java")) {
            lang = new Java();
            return lang;
        }
        else if (name.equals("PHP")) {
            lang = new PHP();
            return lang;
        }

        return lang;
    }
}
