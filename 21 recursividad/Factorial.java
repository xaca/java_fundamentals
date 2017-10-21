import java.math.BigInteger;

public class Factorial {
    public static BigInteger factorial(int n) {
        BigInteger p = new BigInteger("1");
        if (n == 1 || n == 0)
            return BigInteger.valueOf(1);
        p = BigInteger.valueOf(n).multiply(factorial(n - 1));
        return p;
    }

    public static void main(String[] args) {
        System.out.println("factorial(10) = " + factorial(10));
    }
}
