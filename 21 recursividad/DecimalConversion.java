class Convert{
    String decimalToBinry(int number){
        if (number > 0){
            int a = number % 2;
            return (decimalToBinry(number /2) + "" + a );
        }
        return "";
    }
}
public class DecimalConversion{
    public static void main(String[] args) {
        Convert convert = new Convert();
        String binary = convert.decimalToBinry(5);
        System.out.println("Binary Conversion is " + binary);
    }
}