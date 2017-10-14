package medium_level_question_for_loops;

/*
Given 2 numbers M and N, find how the unit's place digit of the expression M^N.
Input format:
M N, two numbers in a line.
Output format:
One integer representing the unit's place digit of M^N.
Example:
Input:
104 3
Output:
4
Explanation:
104^3 = 1124864. Therefore, the answer is 4.
Input:
2023 1917
Output:
3
*/
class unitsdigit {
    public static void main(String args[]) {
        int m, n;   //Scanning two integers from command line
        m = Integer.parseInt(args[0]);
        n = Integer.parseInt(args[1]);
        int p = 0, q = m;
        for (p = 0; p < n - 1; p++) {   // for loop acting as a power function
            q = q % 10;             // modulo by 10 gives us a remainder,doing it multiple times because the size of q doesnt get exceed int size
            q = q * m;              // multiplying units digit with its own number
        }
        System.out.print(q % 10); // printing the remainder
    }
}
