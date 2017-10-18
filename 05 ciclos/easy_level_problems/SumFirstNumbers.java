import java.util.Scanner;

/**
  * EN: Create a program that show the Sum of "N" first numbers.
  * ES: Crear un programa que muestre la suma de los primeros "N" numeros.
  */
public class SumFirstNumbers{
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
    int sum=0;
    for(int i=1;i<=n;i++){
      sum += i;
    }
    System.out.println("Sum = "+sum);
  }

  public static void whileVariant(int n){
    int i=1;
    int sum=0;
    while(i<=n){
      sum += i;
      i++;
    }
    System.out.println("Sum = "+sum);
  }

  public static void doWhileVariant(int n){
    int i=1;
    int sum=0;
    do{
      sum += i;
      i++;
    }while(i<=n);
    System.out.println("Sum = "+sum);
  }
}
