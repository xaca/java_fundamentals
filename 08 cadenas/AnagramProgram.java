import java.util.Arrays;

/**
Problem
----------
Two strings, 'a' and 'b', are called anagrams if they contain all the same characters in the same frequencies. For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.
Complete the function in the editor. If 'a' and 'b' are case-insensitive anagrams, print "Anagrams"; otherwise, print "Not Anagrams" instead.

Input Format
------------
The first line contains a string denoting 'a'. 
The second line contains a string denoting 'b'.

Constraints
------------
- 1 <= length(a), length(b) <= 50
- Strings 'a' and 'b' consist of English alphabetic characters.
- The comparison should NOT be case sensitive.

Ouput Format
------------
Print "Anagrams" if  and  are case-insensitive anagrams of each other; otherwise, print "Not Anagrams" instead.

Sample Input 0
--------------
- anagram
- margana
Sample Ouput 0
--------------
- Anagrams
Explanation 0
--------------
Character	Frequency: anagram	Frequency: margana
A or a				3					3
G or g				1					1
N or n				1					1
M or m				1					1
R or r				1					1

The two strings contain all the same letters in the same frequencies, so we print "Anagrams".

Sample Input 1
--------------
- anagramm
- marganaa
Sample Output 1
---------------
- Not Anagrams
Explanation 1
--------------
Character	Frequency: anagramm	Frequency: marganaa
A or a					3					4
G or g					1					1
N or n					1					1
M or m					2					1
R or r					1					1

The two strings don't contain the same number of a's and m's, so we print "Not Anagrams".

Sample Input 2
--------------
- Hello
- hello
Sample Output 2
---------------
- Anagrams
Explanation 2
---------------
Character	Frequency: Hello	Frequency: hello
E or e				1				1
H or h				1				1
L or l				2				2
O or o				1				1
The two strings contain all the same letters in the same frequencies, so we print "Anagrams".


*/
/**
 * Created by Carlos on 29/09/2017.
 */
public class AnagramProgram
{
    static void isAnagram(String s1, String s2)
    {
        //Removing all white spaces from s1 and s2

        String copyOfs1 = s1.replaceAll("\\s", "");

        String copyOfs2 = s2.replaceAll("\\s", "");

        //Initially setting status as true

        boolean status = true;

        if(copyOfs1.length() != copyOfs2.length())
        {
            //Setting status as false if copyOfs1 and copyOfs2 doesn't have same length

            status = false;
        }
        else
        {
            //Changing the case of characters of both copyOfs1 and copyOfs2 and converting them to char array

            char[] s1Array = copyOfs1.toLowerCase().toCharArray();

            char[] s2Array = copyOfs2.toLowerCase().toCharArray();

            //Sorting both s1Array and s2Array

            Arrays.sort(s1Array);

            Arrays.sort(s2Array);

            //Checking whether s1Array and s2Array are equal

            status = Arrays.equals(s1Array, s2Array);
        }

        //Output

        if(status)
        {
            System.out.println("Anagrams");
        }
        else
        {
            System.out.println("Not Anagrams");
        }
    }

    public static void main(String[] args)
    {
        isAnagram("anagram", "margana");

        isAnagram("anagramm", "marganaa");

        isAnagram("Hello", "hello");

        isAnagram("Mother In Law", "Hitler Woman");

        isAnagram("keEp", "peeK");

        isAnagram("SiLeNt CAT", "LisTen AcT");

        isAnagram("Debit Card", "Bad Credit");

        isAnagram("School MASTER", "The ClassROOM");

        isAnagram("DORMITORY", "Dirty Room");

        isAnagram("ASTRONOMERS", "NO MORE STARS");

        isAnagram("Toss", "Shot");

        isAnagram("joy", "enjoy");
    }
}
