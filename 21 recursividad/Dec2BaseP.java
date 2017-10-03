public class Dec2BaseP {


    public static void dec2BaseP(int decimal, int p) {
        if (decimal>0) {
            int residue = decimal % p;
            decimal /= p;
            dec2BaseP(decimal,p);
            System.out.print(residue<=9 ? (char)('0'+residue) : (char)('A'+residue-10) );
        }
    }
    

    public static void main(String[] args) {
        dec2BaseP(257,2); // Binary
        System.out.println();
    
        dec2BaseP(257,8); // Octal
        System.out.println();

        dec2BaseP(257,16); // Hexadecimal
        System.out.println();

        dec2BaseP(254,16); // Hexadecimal
        System.out.println();
    }


}


