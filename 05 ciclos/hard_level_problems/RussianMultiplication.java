import java.util.Scanner;
/**
  * EN: Create a programa that shows the result of a multiplication of 2 numbers using the russian method.
  * ES: Crear un programa que muestre el producto de 2 numeros usando el metodo ruso
  */
public class RussianMultiplication {
  public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);

    System.out.print("Write the first number: ");
    int a = scanner.nextInt();
    System.out.print("Write the second number: ");
    int b = scanner.nextInt();

    int mul = 0;
    while(b>0){
      if(b%2 !=0){
        mul += a;
      }
      a *= 2;
      b /= 2;
    }

    System.out.println("Result = "+mul);
  }
}
