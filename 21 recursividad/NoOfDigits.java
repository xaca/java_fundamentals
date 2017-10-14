

public class NoOfDigits
{
	public static int count_Digit(int num)
	{
		int count = 1;
		if(num == 0)
		{
			return 1;
		}
		else
		{
			return count+count_Digit(num/10);
		}
	}
	
	public static void main(String[] arg)
	{
		int digit;
		digit = count_Digit(1002);   //here we find no of digits in the integer "1002". we can any integer here.
		System.out.print("No of digits in the given number: "+(digit-1));
	}
}