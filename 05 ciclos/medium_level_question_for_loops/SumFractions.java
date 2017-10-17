/**
  * EN: Create a program that show the sum of: 1/100+2/99+3/98....99/2+100/1
  * ES: Crear un programa que muestre la suma de: 1/100+2/99+3/98...99/2+100/1
  */
public class SumFractions{
  public static void main(String args[]){
    System.out.println("FOR Variant: ");
    forVariant();

    System.out.println("WHILE Variant : ");
    whileVariant();

    System.out.println("DO-WHILE Variant : ");
    doWhileVariant();
  }

  public static void forVariant(){
    float sum=0;
    for(int i=1;i<=100;i++){
      sum += i/(101-i);
    }
    System.out.println("Sum = "+sum);
  }

  public static void whileVariant(){
    int i=1;
    float sum=0;
    while(i<=100){
      sum += i/(101-i);
      i++;
    }
    System.out.println("Sum = "+sum);
  }

  public static void doWhileVariant(){
    int i=1;
    float sum=0;
    do{
      sum += i/(101-i);
      i++;
    }while(i<=100);
    System.out.println("Sum = "+sum);
  }
}
