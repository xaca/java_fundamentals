
public class Division {

	public static void main(String[] args) {

		System.out.println(division(20, 2));

	}

	public static int division(int a, int b) {
		if (b > a)
			return 0;
		else
   		return division(a - b, b) + 1;
	}

}
