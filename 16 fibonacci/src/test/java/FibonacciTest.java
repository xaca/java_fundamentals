import static org.junit.Assert.assertEquals;

import org.junit.Test;
import java.util.logging.Logger;

public class FibonacciTest {

    private static Logger log = Logger.getLogger("FibonacciTest");

    @Test
    public void testCalcularNumeros() {
        testCalcularNumeros(9, "0 1 1 2 3 5 8 13 21 ");
        testCalcularNumeros(12, "0 1 1 2 3 5 8 13 21 34 55 89 ");
    }

    private void testCalcularNumeros(int n, String expected) {

        System.out.println("Calculating Fibonacci up to " + n);
        String result = Fibonacci.calcularNumeros(n);

        System.out.println("Expected is: " + expected);
        System.out.println("Result is: " + result);

        assertEquals(expected, result);
        System.out.println();
    }
}