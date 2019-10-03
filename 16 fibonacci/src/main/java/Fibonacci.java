public class Fibonacci {

	public static void main(String [] args) {
		String result = calcularNumeros(Integer.valueOf(args[0]));
		System.out.println(result);
	}

    public static String calcularNumeros(int n) {
        StringBuilder fibonacciString = new StringBuilder();

        int a = 0, b = 1, c = 0;

        do {
            fibonacciString.append(a + " ");
            c = a + b;
            a = b;
            b = c;
        } while (--n > 0);

        return fibonacciString.toString();
    }
}
