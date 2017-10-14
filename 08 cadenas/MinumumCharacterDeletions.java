/*
 * Given two strings, a and b , that may or may not be of the same length, 
 * determine the minimum number of character deletions required to make a and b anagrams. 
 * Any characters can be deleted from either of the strings.
 * 
 * You can find the problem here
 * 
 * https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/anagrams-651/
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MinumumCharacterDeletions {

	public static void main(String args[]) throws NumberFormatException,
			IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		char ch1[] = str1.toCharArray();
		char ch2[] = str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		List<Character> l1 = new LinkedList<>();
		List<Character> l2 = new LinkedList<>();
		for (char c : ch1){
			l1.add(c);
		}
		for (char c : ch2){
			l2.add(c);
		}
		Iterator<Character> i1 = l1.iterator();
		Iterator<Character> i2 = l2.iterator();
		while (i1.hasNext() && i2.hasNext()) {
			Character c = i1.next();
			if (l2.contains(c)) {
				i1.remove();
				l2.remove(c);
			}
		}
		int size = l1.size() + l2.size();
		System.out.println(size);
	}
}
