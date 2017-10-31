package algorithm;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class SudokuSolver {
	private static Boolean solutionFound = false;
	
    public static void main(String[] args) {
    	int[][] sudoku = readFromFile("sudoku1.txt");
	/*File structure is a txt with 9 lines in each line you'll finde 9 characters separated by comma.
	  Characters will be or 1-9 represents that value in the sudoku game or a 'x' represents an empty space to fill*/    
	    
    	System.out.print("Working with the following sudoku");
    	
    	printSudoku(sudoku);
    	
    	Boolean solution = solveSudoku(sudoku, 0, -1);
    	if(solution){
	    	System.out.println("\n");
	    	System.out.print("We've found a solution!!");
	    	printSudoku(sudoku);
    	}else{
	    	System.out.println("\n");
	    	System.out.print("That sudoku has no solution ");
    	}
    }

	private static Boolean solveSudoku(int[][] sudoku, int row, int col) {
		SudokuSolver.Pair position = getNextPosition(row, col);
		
		if(!solutionFound){
	    	if(sudoku[position.getRow()][position.getCol()]  != 0){
				if(!solveSudoku(sudoku, position.getRow(), position.getCol())){
					return false;
				}
				return solveSudoku(sudoku, position.getRow(), position.getCol());
			}else{
				for(int i=1; i<=9; i++){
					sudoku[position.getRow()][position.getCol()] = i;
					if(isValidSudoku(sudoku, position.getRow(), position.getCol(), i)){
						if(solveSudoku(sudoku, position.getRow(), position.getCol())){
							return true;
						}
					}
				}
				sudoku[position.getRow()][position.getCol()] = 0;
				return false;
			}
	    }else{
	    	return true;
	    }

	}

	private static boolean isValidSudoku(int[][] sudoku, int row, int col, int value) {
		if(checkRows(sudoku, row, col, value) && 
				checkCols(sudoku, row, col, value) && 
				checkGrid(sudoku, row, col, value) ){
			return true;
		}
		return false;
	}

	private static boolean checkCols(int[][] sudoku, int row, int col, int value) {
		for(int i = 0; i<9;i++){
			if(i != col && sudoku[row][i] == value){
				return false;
			}
		}	
		return true;
	}

	private static boolean checkGrid(int[][] sudoku, int row, int col, int value) {
	    int rowBox = row / 3;
	    int colBox = col / 3;

	    for (int r = rowBox * 3; r < rowBox * 3 + 3; r++) {
	        for (int c = colBox * 3; c < colBox * 3 + 3; c++) {
	            if (r != row && c != col && sudoku[r][c] == value) {
	                return false;
	            }
	        }
	    }
	    return true;
	}

	private static boolean checkRows(int[][] sudoku, int row, int col, int value) {	
		for(int i = 0; i<9;i++){
			if(i != row && sudoku[i][col] == value){
				return false;
			}
		}	
		return true;
	}

	private static Pair getNextPosition(int row, int col) {
		SudokuSolver t = new SudokuSolver();

	    col++; // Move to next cell in row
	    if (col > 8) { // Moves to next row when end of column is reached
	    	col = 0;
	        row++;
	        if (row > 8) { // Checks if end of grid is reached
	        	solutionFound = true;
	        }
	    }
		SudokuSolver.Pair position = t.new Pair(row, col);
		
		return position;
	}

	private static int[][] readFromFile(String sudokuFile) {
		int[][] sudoku = new int[9][9];
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(sudokuFile));
		} catch (FileNotFoundException e) {
			br = null;
			e.printStackTrace();
		}
		try {
		    StringBuilder sb = new StringBuilder();
		    String line = br.readLine();
		    int row = 0;
		    while (line != null) {
		    	String[] data = line.split(",");
		    	int col = 0;
		    	for(String number : data){
		    		if("x".equals(number)){
		    			sudoku[row][col] = 0;
		    		}else{
		    			sudoku[row][col] = Integer.valueOf(number);
		    		}
		    		col++;
		    	}
		        sb.append(line);
		        sb.append(System.lineSeparator());
		        line = br.readLine();
		        row++;
		    }
		} catch (Exception e){
			System.out.println(e.toString());
		} 
		
		return sudoku;
	}
	
	public static void printSudoku(int sudoku[][]) {
	    for (int i = 0; i < 9; i++) {
            System.out.print("\n");
            if(i%3==0){
                System.out.print("\n");
            }
	        for (int j = 0; j < 9; j++) {
	            if (j % 3 == 0){
	                System.out.print(" ");
	        	}
	            if (sudoku[i][j] == 0){
	                System.out.print(". ");
	            }else{
	            	System.out.print(sudoku[i][j] +" ");
	            }
	        }
	    }
	}
	
	public class Pair {
		private int row;
		private int col;
		
		public Pair(int row, int col){
			this.row = row;
			this.col = col;
		}
		
		public int getRow() {
			return row;
		}
		public void setRow(int row) {
			this.row = row;
		}
		public int getCol() {
			return col;
		}
		public void setCol(int col) {
			this.col = col;
		}
	}
	
	public static class MyRunnable implements Runnable {
		private final String url;
 
		MyRunnable(String url) {
			this.url = url;
		}
 
		@Override
		public void run() {
 

		}
	}

}
