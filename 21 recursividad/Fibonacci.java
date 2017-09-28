public class Fibonacci {
    public static int fib(int i) {
        if (i <= 1) {
            return i;
        } else {
            return fib(i - 1) + fib(i - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println("fib(15) = " + fib(15));
    }
}