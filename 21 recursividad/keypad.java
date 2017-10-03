public class solution {

	// Return a string array that contains all the possible strings
	public static String[] keypad(int n){
	String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	String[] newans=alphaNum(n,map);	// Write your code here
    return newans;
	}
	public static String[] alphaNum(int num,String[] map) {
		
		if(num==0){
			String[] ans={""};
			return ans;
		}
		String smallAns[]=alphaNum(num/10, map);
		int lastdigit=num%10;
		String lastdigitopt=map[lastdigit];
		String ans[]=new String[smallAns.length*lastdigitopt.length()];
		int k=0;
		
		for(int i=0;i<lastdigitopt.length();i++){
			for(int j=0;j<smallAns.length;j++){
				ans[k]=smallAns[j] + lastdigitopt.charAt(i);
				k++;
			}
		}
		return ans;
	}
}
