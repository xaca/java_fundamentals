/*
Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

For example,
Given "egg", "add", return true.

Given "foo", "bar", return false.

Given "paper", "title", return true.

Note:
You may assume both s and t have the same length.

*/

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
