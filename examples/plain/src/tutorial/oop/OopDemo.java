package tutorial.oop;

public class OopDemo {
    public static void main(String[] args) {
        BankAccount a = new BankAccount("A-100");
        BankAccount b = new BankAccount("B-200");

        a.deposit(10_00);
        a.transferTo(b, 4_00);

        System.out.println(a);
        System.out.println(b);
    }
}
