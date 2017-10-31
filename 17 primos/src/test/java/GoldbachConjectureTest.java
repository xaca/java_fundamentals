import org.junit.Assert;
import org.junit.Test;

public class GoldbachConjectureTest {

    /**
     * Obtain the goldbach decomposition if many even numbers
     */
    @Test
    public void testGoldbach() {
        testGoldbach(495788458 , 5);
        testGoldbach(944248612 , 5);
        testGoldbach(1029284668 , 89);
        testGoldbach(652763930 , 31);
    }

    private void testGoldbach(int input, int expectedGoldbach) {
        int actualGoldbach = GoldbachConjecture.goldbach(input);

        Assert.assertEquals(expectedGoldbach, actualGoldbach);
        System.out.println(input+" = "+actualGoldbach+" + "+(input-actualGoldbach));
    }
}
