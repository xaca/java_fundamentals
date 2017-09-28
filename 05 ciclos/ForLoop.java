//código para calcular la suma y el promedio de una lista de números
//usando un "while loop"
public class ForLoop{

	public static void main(String[] args) {
			int suma=0;
      int promedio=0;
      int[] myList = {1,2,3,4,5};
			for(int i=0;i<myList.length;i++){
        suma+=myList[i];
      }
      promedio=suma/myList.length;
			System.out.println("La suma es "+suma+" y el promedio es "+promedio);
	}

}
