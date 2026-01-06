package tutorial.flow;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            boolean fizz = i % 3 == 0;
            boolean buzz = i % 5 == 0;

            if (fizz && buzz) {
                System.out.println("FizzBuzz");
            } else if (fizz) {
                System.out.println("Fizz");
            } else if (buzz) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
