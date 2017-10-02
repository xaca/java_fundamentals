import java.util.Scanner;

public class RCMatrix {
    /**
     * Searches the element x in mat[][]
     * where mat is a row and column square sorted matrix.
     * If the element is found, then prints its position
     * and returns true, otherwise prints "not found"
     * and returns false.
     * @param mat -The matrix that is row and column sorted and where we will search the element
     * @param n - No of rows and columns in matrix
     * @param x -Element to be searched in the matrix
     */
    private static void search(int[][] mat, int n, int x) {

        int i = 0, j = n-1;  //set indexes for top right
        // element

        while ( i < n && j >= 0 )
        {
            if ( mat[i][j] == x )
            {
                System.out.print("Element Found at ["+ i + "][" + j + "]");
                return;
            }
            if ( mat[i][j] > x ) {
                j--;
            }
            else {
                //  if mat[i][j] < x
                i++;
            }
        }

        System.out.print("Element not found");
        return;  // if ( i==n || j== -1 )

    }
    // driver program to test above function
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows in the square matrix");
        int n = s.nextInt();
        System.out.println("Enter the element you want to search");
        int x = s.nextInt();
        System.out.println("Now, Enter the elements row-wise");
        int[][] mat = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=s.nextInt();
            }
        }
        search(mat, n, x);
    }

}
