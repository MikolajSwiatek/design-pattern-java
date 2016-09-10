package ValueObject;

public class Main {
    public static void main(String[] args) {
        Student studentA = Student.valueOf("A", "12345", 20);
        Student studentB = Student.valueOf("A", "12345", 20);
        Student studentC = Student.valueOf("C", "12346", 21);

        System.out.println(studentA);
        System.out.println(studentB);
        System.out.println(studentC);

        System.out.println(studentA.equals(studentB));
        System.out.println(studentA.equals(studentC));
        System.out.println(studentB.equals(studentC));
    }
}