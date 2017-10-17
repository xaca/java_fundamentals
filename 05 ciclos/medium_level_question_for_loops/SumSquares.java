/**
  * EN: Create a program that show the sum of 1²-2²+3².....100²
  * ES: Crear un programa que muestre la suma de: 1²-2²+3².....100²
  */
  public class SumSquares{
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
        if(i%2==0)
          sum -= Math.pow(i,2);
        else
          sum += Math.pow(i,2);
      }
      System.out.println("Sum = "+sum);
    }

    public static void whileVariant(){
      int i=1;
      float sum=0;
      while(i<=100){
        if(i%2==0)
          sum -= Math.pow(i,2);
        else
          sum += Math.pow(i,2);
        i++;
      }
      System.out.println("Sum = "+sum);
    }

    public static void doWhileVariant(){
      int i=1;
      float sum=0;
      do{
        if(i%2==0)
          sum -= Math.pow(i,2);
        else
          sum += Math.pow(i,2);
        i++;
      }while(i<=100);
      System.out.println("Sum = "+sum);
    }
  }
