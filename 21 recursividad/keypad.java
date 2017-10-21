public class keypad {

	/*
    Given an integer n, using alpha-numeric keypad return all strings that can be made using digits of n

    Sample input:
    23

    Sample output:
    ad
    ae
    af
    bd
    be
    bf
    cd
    ce
    cf
    */ 


    //helper function
	public static String[] keypad(int n){
	String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};//map of alphanumeric keys
	String[] newans=alphaNum(n,map);
    return newans;
	}

    //recursive function
	public static String[] alphaNum(int num,String[] map) {
		
        //base case
		if(num==0){
			String[] ans={""};
			return ans;
		}

        
		String smallAns[]=alphaNum(num/10, map);//recursive call

		int lastdigit=num%10;
		String lastdigitopt=map[lastdigit];

        //variable to store answer of current function call
		String ans[]=new String[smallAns.length*lastdigitopt.length()];
		int k=0;

		//concatinate words from smallans with lastDigitOptions and store in answer
		for(int i=0;i<lastdigitopt.length();i++){
			for(int j=0;j<smallAns.length;j++){
				ans[k]=smallAns[j] + lastdigitopt.charAt(i);
				k++;
			}
		}

        //return answer
		return ans;
	}
}
