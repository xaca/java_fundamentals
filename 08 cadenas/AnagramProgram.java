import java.util.Arrays;

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