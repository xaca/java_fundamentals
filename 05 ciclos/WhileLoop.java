//código para imprimir un número aleatorio mientras el usuario escribe "sí"
import java.util.Scanner;
import java.util.Random;

public class WhileLoop{

	public static void main(String[] args) {

      Random rand = new Random();
      Scanner s=new Scanner(System.in);
      System.out.println("¿Quieres un número aleatorio? S(Si) o N(no)");
      String answer="";
      answer=s.nextLine();
      answer=answer.toUpperCase();
      while(!answer.equals("N")){
        if(answer.equals("S")){
          int  n = rand.nextInt(100) + 1;
          System.out.println(n);
        }else{
          System.out.println("¡Su respuesta no es válida!");
        }
        System.out.println("¿Quieres un número aleatorio? S(Si) o N(no)");
        answer=s.nextLine();
        answer=answer.toUpperCase();
      }
	}

}
