public class sum1ton {
    public static void main(String[] args) {
        System.out.println(sum(10)); // result: 55
    }

    /*
    *   Count sum S(n) = 1 + 2 + 3 + ... + n
    *   n >= 0
    */
    public static long sum(int n) {
        if (n == 0)
            return 0;
        return sum(n - 1) + n;
    }
}
