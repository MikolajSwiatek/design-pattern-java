package AbstractFactoryPattern;

public class DiscBuilder {
    public static Disc getDisc(DiscAbstractFactory factory){
        return factory.makeDisc();
    }
}
