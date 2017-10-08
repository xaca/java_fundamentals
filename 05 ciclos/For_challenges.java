public class For_challenges {
	int number_of_words(char[] S)
	{
//		Challenge 1, Solved:
		
		int words = 0;
		for (int i = 0; i < S.length; i++)
		{
			if (S[i] == ' ' && i != S.length-1)
				//Second condition goes for a "sentence" ended in a space.
				words++;
		}
		words++;
		return words;
	}
	
	int positive_numbers(int [] S)
	{
//		Challenge 2.a, Solved:
		int numbers = 0;
		for (int i = 0; i < S.length; i++)
			if (S[i] >= 0)
				numbers++;
		return numbers;
	}
	
	int negative_numbers(int [] S)
	{
//		Challenge 2.b, Solved:
		int numbers = 0;
		for (int i = 0; i < S.length; i++)
			if (S[i] < 0)
				numbers++;
		return numbers;
	}

	int sum_diagonal(int [][] M)
	{
//		Challenge 3, Solved:
		int sum = 0;
		for (int i = 0, j = M.length-1; i < M.length && j >= 0; i++, j--)
			sum += M[i][j];
		return sum;
	}
	
	public static void main (String args[])
	{
/*		1. Number of wards in a char array (separated by spaces)
		2. Number of negative and positive numbers in an int array
		3. Sum of the elements of the secondary diagonal of a matrix.
				-> Use a single for loop
				-> Use incrementation/decrementation only in the for() header
*/
		
//		Check:
		
		For_challenges _for = new For_challenges();
		char S[] = {'I',' ','l','u','v',' ','u','s','i','n','g',' ','f','o','r',' ','l','o','o','p',' '};
		int Arr[] = {-1, 10, 20, -40, 50, 99, 10, -3};
		int Mat[][] = {{1, 2 ,3 ,4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
		
//		Check 1:
		System.out.println("Number of words is equal to " + _for.number_of_words(S));

//		Check 2:
		System.out.println("Number of negative numbers is equal to " + _for.negative_numbers(Arr));
		System.out.println("Number of positive numbers is equal to " + _for.positive_numbers(Arr));
		
//		Check 3:
		System.out.println("The sum of the secondary diagonal is equal to " + _for.sum_diagonal(Mat));
	}
}
