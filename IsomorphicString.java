import java.io.*;
import java.util.*;
public class IsomorphicString {
    static int size = 256;

    public static void main(String[] args) {
        boolean res = checkIsomorphic("aab", "xxy");
        System.out.println(res);

        res = checkIsomorphic("Egg", "Dad");
        System.out.println(res);

        res = checkIsomorphic("aab", "xyz");
        System.out.println(res);

    }

    public static boolean checkIsomorphic(String str1, String str2){
        int lenStr1 = str1.length();
        int lenStr2 = str2.length();

        if(lenStr1 != lenStr2) return false;

        int[] map = new int[size];
        Boolean[] marked = new Boolean[size];
        Arrays.fill(map, -1);
        Arrays.fill(marked, Boolean.FALSE);

        for(int i=0; i < lenStr1; i++){
            if(map[str1.charAt(i)] == -1){
                if(marked[str2.charAt(i)] == true) return false;
                marked[str2.charAt(i)] = true;
                map[str1.charAt(i)] = str2.charAt(i);
            }
            else if(map[str1.charAt(i)] != str2.charAt(i)) return false;
        }
        return true;

    }
}
