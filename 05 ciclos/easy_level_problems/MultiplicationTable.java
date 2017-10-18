import java.util.Scanner;
/**
  * EN: Create a programa that shows the Multiplication Table of a number
  * ES: Crear un programa que muestre la tabla de multiplicación de un numero
  */
public class MultiplicationTable{
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
    for(int i=1;i<=12;i++){
      System.out.println(i + " x " + n + " = "+ (i*n));
    }
  }

  public static void whileVariant(int n){
    int i=1;
    while(i<=12){
      System.out.println(i + " x " + n + " = "+ (i*n));
      i++;
    }
  }

  public static void doWhileVariant(int n){
    int i=1;
    do{
      System.out.println(i + " x " + n + " = "+ (i*n));
      i++;
    }while(i<=12);
  }
}
