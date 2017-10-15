import java.util.Scanner;

class ScannerUsage {


    public static void main(String[] args) {

        // Initialize the Scanner object to use the standard input
        Scanner sc = new Scanner(System.in);
        
        // Use the Scanner object to read various variable types
        System.out.print("Enter an integer : ");
        int i = sc.nextInt();

        System.out.print("Enter a long : ");
        long l = sc.nextLong();

        System.out.print("Enter a boolean : ");
        boolean b = sc.nextBoolean();

        System.out.print("Enter a float : ");
        float f = sc.nextFloat();

        System.out.print("Enter an double : ");
        double d = sc.nextDouble();


        // Read strings until the End Of File (EOF)
        System.out.println("Enter strings. Finish with Ctrl-D");
        while(sc.hasNext()) {
            String s = sc.next();
        }

        System.out.println("That's all folks!");
        
        // Close the Scanner
        sc.close();
        
    }
    


}

