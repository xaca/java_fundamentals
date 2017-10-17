import java.util.Scanner;
/**
  * EN: Create program that shows the first "N" even numbers.
  * ES: Crear un programa que muestre los primeros "N" numeros pares.
  */
public class EvenNumbers{
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
      System.out.println(2*i);
    }
  }

  public static void whileVariant(int n){
    int i=1;
    while(i<=n){
      System.out.println(2*i);
      i++;
    }
  }

  public static void doWhileVariant(int n){
    int i=1;
    do{
      System.out.println(2*i);
      i++;
    }while(i<=n);
  }
}
