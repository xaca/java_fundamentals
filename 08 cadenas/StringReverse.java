//How to reverse a String in java using StringBuilder

import java.util.Scanner;
class StringReverse
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		//Take a String from User to reverse.
		String str=scan.next();
		//just declare stringbuilder and put user string to it
		StringBuilder ptr=new StringBuilder(str);
		//user stringbuilder.reverse() to reverse it.
		ptr.reverse();
		//Now convert StringBuilder back to String
		String result=ptr.toString();
		System.out.println(result);

	}
}