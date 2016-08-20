package AbstractFactoryPattern;

public class Main {
    public static void main (String[] args) {
        Disc hdd = DiscBuilder.getDisc(new HddFactory("A", 8));
        Disc ssd = DiscBuilder.getDisc(new SsdFactory("B", 8));

        print(hdd);
        print(ssd);
    }

    private static void print(Disc disc) {
        System.out.println(disc);
    }
}
