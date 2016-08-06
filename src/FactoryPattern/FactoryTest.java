package FactoryPattern;

import org.junit.Test;
import static org.junit.Assert.*;

public class FactoryTest {
    @Test
    public void checkJavaLang() {
        Lang java1 = LangFactory.buildLang("Java");
        Lang java2 = LangFactory.buildLang("java");

        assertTrue(java1.getName().equals("Java"));
        assertTrue(java2 == null);
    }

    @Test
    public void checkPHPLang() {
        Lang php1 = LangFactory.buildLang("PHP");
        Lang php2 = LangFactory.buildLang("php");

        assertTrue(php1.getName().equals("PHP"));
        assertTrue(php2 == null);
    }
}
