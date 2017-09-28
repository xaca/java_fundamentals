public class Factorial {
    public static int factorial(int num) {
        if (num > 1) {
            return num * factorial(num - 1);
        }
        
        return num;
    }

    public static void main(String[] args) {
        System.out.println("factorial(10) = " + factorial(10));
    }
}