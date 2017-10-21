package Palindrome.Solutions;

import java.util.Scanner;

public class Palindrome {

	public static void main(String args[]) {
		System.out.println("Enter a string to test: ");
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();

		System.out.print("Slow: ");
		if(isPalindromeSlow(input)){
			System.out.println("This string is a Palindrome");
		} 


		System.out.print("Fast: ");
		if(isPalindromeFast(input)){
			System.out.println("The string is a Palindrome");
		}

		System.out.print("Recursion: ");
		if(isPalindromeRecursion(input)){
			System.out.println("The string is a Palindrome");
		} 

	}


	/*
	*	This solution will loop through the entire string to check if 
	*	its mirrored location is the same.
	*
	* 	This is the slowest solution becasue it will check each character
	*	location twice
	*/
	public static boolean isPalindromeSlow(String input){

		for(int i = 0; i < input.length(); i++){
			if(input.charAt(i) != input.charAt(input.length()-1-i)){
				System.out.println("This string is not a Palindrome");
				return false;
			}
		}
		return true;


	} 

	/*
	*	This solution will loop through half the string, minus the middle 
	*	character if the length is odd, to check if its mirrored location
	*	is the same.
	*
	* 	This is a faster solution becasue it will check each character
	*	location only once.
	*/
	public static boolean isPalindromeFast(String input){

		for(int i = 0; i < input.length()/2; i++){
			if(input.charAt(i) != input.charAt(input.length()-1-i)){
				System.out.println("This string is not a Palindrome");
				return false;
			}
		}
		return true;

	}

	/*
	*	This solution will recursivly check if the string is a palindrome.
	*
	*	It does this by checking the first and last character in the string.
	*	If they match, then it will shorten the string to the middle 
	*	characters and call the same method again. 
	*/
	public static boolean isPalindromeRecursion(String input){

		if(input.length() < 2){
			return true;
		} else {
			if( input.charAt(0) != input.charAt(input.length()-1 )){
				System.out.println("This string is not a Palindrome");
				return false;
			} else {
				return isPalindromeRecursion(input.substring(1, input.length()-1));
			}
		}
	}

}
