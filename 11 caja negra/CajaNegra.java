import java.util.Arrays;

public class CajaNegra{
	public static void main(String[] args) {
		
		int datos[] = {8,54,3,23,2,1,-55,999,77,6,23,11,789,982,1,4,0,-2,3,4};

		System.out.println(Arrays.toString(datos));
		Arrays.sort(datos);
		System.out.println(Arrays.toString(datos));

		System.out.println(Arrays.binarySearch(datos,789));


	}
}