import java.util.Scanner;
import java.lang.Math;
/**
  * EN: Create a program that show the first "N" numbers, their square and cube
  * ES: Crear un programa que muestre los primero "N" numeros, sus cuadrados y cubos.
  */
public class SquareAndCube{

  public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Write a number : ");
    int n = scanner.nextInt();
    System.out.println("FOR Variant: ");
    forVariant(n);

    System.out.println("WHILE Variant : ");
    whileVariant(n);

    System.out.println("DO-WHILE Variant : ");
    doWhileVariant(n);
  }

  public static void forVariant(int n){
    for(int i=1;i<=n;i++){
      System.out.println("x = "+i +"\t x^2 = "+Math.pow(i,2)+"\t x^3 = "+Math.pow(i,3));
    }
  }

  public static void whileVariant(int n){
    int i=1;
    while(i<=n){
      System.out.println("x = "+i +"\t x^2 = "+Math.pow(i,2)+"\t x^3 = "+Math.pow(i,3));
      i++;
    }
  }

  public static void doWhileVariant(int n){
    int i=1;
    do{
      System.out.println("x = "+i +"\t x^2 = "+Math.pow(i,2)+"\t x^3 = "+Math.pow(i,3));
      i++;
    }while(i<=n);
  }
}
