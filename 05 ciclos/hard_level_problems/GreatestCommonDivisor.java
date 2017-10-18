import java.util.Scanner;
/**
  * EN: Create a programa that shows the GCD of 2 numbers
  * ES: Crear un programa que muestre el MCD de 2 numeros
  */
public class GreatestCommonDivisor {
  public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.print("Write the first number: ");
    int a = scanner.nextInt();
    System.out.print("Write the second number: ");
    int b = scanner.nextInt();

    int rest=a%b;
    while(rest !=0){
      a=b;
      b=rest;
      rest=a%b;
    }
    int gcd=b;
    System.out.println("GCD = "+gcd);
  }
}
