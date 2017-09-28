import java.util.Scanner;

/*|-------||-------||-------||-------||-------||
Recursive algorithm to 
return all possible subsequences of a String.

Sample input: 
abc

Sample output:
 "" (Empty string)
 c
 b
 bc
 a
 ac
 ab
 abc
 |-------||-------||-------||-------||-------||*/
public class AllSubsequences {

	// Function that returns the subsequences saved in a string array
	public static String[] subsequence(String input){
        //Base case condition to check if the input string is empty 
        if(input.length()==0){
		String[] ans=new String[1];
		ans[0]="";
		return ans;	
        }
    
        //Recursive call
	    String[] smallans=subsequence(input.substring(1));
        
        //New string array to store the result to be returned
        String[] ans=new String[2*smallans.length];

        //Loop to copy the result of the recursive call  
	    for(int i=0;i<smallans.length;i++){
		    ans[i]=smallans[i];
        }
        
        //Loop to append the result of the recursive call to the first character to 
        //generate all subsequences starting from that character
	    for(int i=0;i<smallans.length;i++){
		    ans[i+smallans.length]=input.charAt(0)+smallans[i];
	    }
    
        //Return the result
        return ans;

    }
    
    /* Driver program to test above functions. Ideally
       this function should be in a separate user class.
       It is kept here to keep code compact */
    public static void main(String[] args) {
    
        Scanner s = new Scanner(System.out);
        //Take input
        System.out.println("Enter the string to find the subsequences");
        String input = s.next();

        //Call the recursive function
        String[] answer = subsequence(input);

        //Display the result
        for(int i=0;i<answer.length;i++){
            System.out.println(answer[i]);
        }
    }
}
