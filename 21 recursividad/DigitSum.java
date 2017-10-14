
public class DigitSum {
	int sumOfdigit(int num,int sum)
	{
		if(num == 0)
		{
			return sum;
		}
		else
		{
			return(sumOfdigit((num/10),sum+(num%10)));
		}
	}
public static void main(String[] arg)
{
	DigitSum obj = new DigitSum();
	int sum = 0;
	int sum1 = obj.sumOfdigit(45678,sum); //here we find the sum of digits of "45678".Here we can take any Integer.
	System.out.println("Sum of digits = "+sum1);
}
}
