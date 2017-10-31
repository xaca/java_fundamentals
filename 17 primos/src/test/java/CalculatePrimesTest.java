import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;

public class CalculatePrimesTest {

    @Test
    public void testFindPrimes() {
        int[] expectedValues = new int[] { 2, 3, 5, 7, 11, 13, 17, 19 };

        int[] actualValues = CalculatePrimes.findPrimes(20);

        Assert.assertArrayEquals(expectedValues, actualValues);
        System.out.println( Arrays.toString(actualValues));
    }
}
