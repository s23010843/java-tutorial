package tutorial.methods;

public final class MathUtil {
    private MathUtil() {}

    public static int add(int a, int b) {
        return a + b;
    }

    public static int max(int a, int b) {
        return a >= b ? a : b;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int d = 3; d * d <= n; d += 2) {
            if (n % d == 0) return false;
        }
        return true;
    }
}
