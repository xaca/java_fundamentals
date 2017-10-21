import java.util.Scanner;
/*|-------||-------||-------||-------||-------||
Recursive algorithm to 
return all possible perutations of a String.

Sample input:
abc

Sample output:
abc
acb
bac
bca
cab
cba

|-------||-------||-------||-------||-------||*/

public class Permutations {


    public static String[] permutationOfString(String input) {
        //Base case condition to check if the input string is of length 1
        if (input.length() == 1) {
            String[] ans = new String[1];
            ans[0] = input;

            return ans;
        }
        //String array to store the result to be returned
        String[] ans = new String[fact(input.length())];

        //String to store the result of recursive calls
        String[] smallAns;

        int k = 0;
        for (int j = 0; j < input.length(); j++) {
            //Recursive call
            smallAns = permutationOfString(input.substring(0, j) + input.substring(j + 1));

            //Append characters to compute the answer string
            for (int i = 0; i < ans.length / input.length(); i++) {
                ans[k] = "" + input.charAt(j) + smallAns[i];
                k++;
            }

        }
        //Return the answer
        return ans;

    }

    //Function to calculate factorial
    public static int fact(int n) {
        if (n == 0 || n == 1)
            return 1;

        return n * fact(n - 1);
    }

    /* Driver program to test above functions. Ideally
    this function should be in a separate user class.
    It is kept here to keep code compact */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Take input
        System.out.println("Enter the string to find the permutations");
        String input = s.next();

        //Call the recursive function
        String[] answer = permutationOfString(input);

        //Display the result
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }
}


