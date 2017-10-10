import java.util.List;

/**
 * Class that provides FizzBuzz challenge
 *
 * @author alexescg
 * @since 10/09/2017
 */
public class FizzBuzz {

    public static void main(String[] args) {
        List<String> fizzbuzz = new FizzBuzz().solution(15);
        if (fizzbuzz.get(0).equals("1")
                && fizzbuzz.get(1).equals("2")
                && fizzbuzz.get(2).equals("Fizz")
                && fizzbuzz.get(3).equals("4")
                && fizzbuzz.get(4).equals("Buzz")
                && fizzbuzz.get(5).equals("Fizz")
                && fizzbuzz.get(6).equals("7")
                && fizzbuzz.get(7).equals("8")
                && fizzbuzz.get(8).equals("Fizz")
                && fizzbuzz.get(9).equals("Buzz")
                && fizzbuzz.get(10).equals("11")
                && fizzbuzz.get(11).equals("Fizz")
                && fizzbuzz.get(12).equals("13")
                && fizzbuzz.get(13).equals("14")
                && fizzbuzz.get(14).equals("FizzBuzz")) {
            System.out.println("Correct!");
        } else {
            System.out.println("Not correct :(");
        }
    }

    /**
     * Write a program that outputs the string representation of numbers from 1 to n.
     * For multiples of 3 the output should be “Fizz” instead of the number.
     * For multiples of 5 the output should be “Buzz” instead of the number.
     * For numbers which are multiples of both 3 and 5 output “FizzBuzz”.
     * n = 15,
     * Return: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
     *
     * @param n number of ints to be converted
     * @return array of strings following the problem rules
     */
    public List<String> solution(int n) {
        //logic
        return null; //remove this line when you start coding
    }
}
