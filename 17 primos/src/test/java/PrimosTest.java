import org.junit.Assert;
import org.junit.Test;
import java.util.HashSet;
import java.util.Set;

public class PrimosTest {

    @Test
    public void testIsPrimo() {

        int n = 35, m = 60;

        Set<Integer> expectedPrimos = new HashSet<>();
        expectedPrimos.add(37);
        expectedPrimos.add(41);
        expectedPrimos.add(43);
        expectedPrimos.add(47);
        expectedPrimos.add(53);
        expectedPrimos.add(59);

        for (int i = n; i <= m; i++) {
            if (Primos.esPrimo(i)) {
                Assert.assertTrue(expectedPrimos.contains(i));
                System.out.println(i + " ");
            }
        }
    }
}