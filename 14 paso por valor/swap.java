public class Swap {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("in swap function. x = " + a + " y = " + b);
    }
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        System.out.println("before swap x = " + x + " y = " + y);
        swap(x, y);
        System.out.println("after swap x = " + x + " y = " + y);
    }
}