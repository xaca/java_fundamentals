public class Sqrt {
    public static void main(String[] args) {
        System.out.println(sqrtn(8.0, 3)); // result: 2.0
    }

    /*
    *   nth root of number x
    *
    */
    public static double sqrtn(double x, int nth) {
        if (x == 0)
            return 0;
        if (x < 0)
            return (-sqrt3(-x, nth));
        return Math.exp((Math.log(x) / nth));
    }
}
