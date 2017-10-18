import java.util.Random;
/**
  * EN: Create a program that show the hot and cold days (consider > 0° as hot day and 0° < as hot day)
  * ES: Crear un programa que muestre los dias frios y templados (Considerar > 0° como frio y 0° < como templado)
  */
public class Temperature{
  public static void main(String args[]){
    int n=10;
    // We are generating random numbers here
    int[] temperatures = new int[n];
    generateNumbers(temperatures);
    showArray(temperatures);

    System.out.println("FOR Variant: ");
    forVariant(temperatures);

    System.out.println("WHILE Variant : ");
    whileVariant(temperatures);

    System.out.println("DO-WHILE Variant : ");
    doWhileVariant(temperatures);
  }

  public static void forVariant(int[] array){
    int hotDays = 0;
    int coldDays = 0;
    for(int i=1;i<array.length;i++){
      if(array[i]<=0){
        coldDays++;
      }else{
        hotDays++;
      }
    }
    System.out.println("Cold days = "+coldDays+" | hot days = "+hotDays);
  }

  public static void whileVariant(int[] array){
    int i=1;
    int hotDays = 0;
    int coldDays = 0;
    while(i<array.length){
      if(array[i]<=0){
        coldDays++;
      }else{
        hotDays++;
      }
      i++;
    }
    System.out.println("Cold days = "+coldDays+" | hot days = "+hotDays);
  }

  public static void doWhileVariant(int[] array){
    int i=1;
    int hotDays = 0;
    int coldDays = 0;
    do{
      if(array[i]<=0){
        coldDays++;
      }else{
        hotDays++;
      }
      i++;
    }while(i<array.length);
    System.out.println("Cold days = "+coldDays+" | hot days = "+hotDays);
  }

  private static void generateNumbers(int[] array){
    Random random = new Random();
    for(int i=0;i<array.length;i++){
      array[i]=random.nextInt(50)-random.nextInt(50);
    }
  }

  private static void showArray(int[] array){
    for(int i=0;i<array.length;i++){
      System.out.println("Temperature "+(i+1)+" = "+array[i]);
    }
  }
}
