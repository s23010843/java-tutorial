package tutorial.basics;

public class BasicsDemo {
    public static void main(String[] args) {
        int age = 25;
        long population = 8_000_000_000L;
        double price = 19.99;
        boolean active = true;
        char grade = 'A';
        String city = "Colombo";

        System.out.printf("age=%d, population=%d, price=%.2f, active=%s, grade=%c, city=%s%n",
                age, population, price, active, grade, city);

        String a = "hi";
        String b = new String("hi");
        System.out.println("a.equals(b) = " + a.equals(b));
        System.out.println("a == b       = " + (a == b));
    }
}
