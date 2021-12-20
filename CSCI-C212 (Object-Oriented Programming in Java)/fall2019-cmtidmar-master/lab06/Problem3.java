package lab06;

import java.util.Scanner;

public class Problem3 {
	public static void main(String[] args) {
	/*
	 1. Data Representation: 
	 	- matrix
	 	- user input (row, column, n)
	 	
	 2. Examples of Data Representation:
	 	- row = [1, 2, 3, 4, 5]
	 	- column = [6, 7, 8, 9, 10]
	 
	 3. Name of Function: Square
	 	Signature: int[][] square;
	 	
	 4. Purpose: The purpose is to make a matrix (magic square) with
	 	the values given by the user.
	 
	 5. Examples of how function will work:
	 	User inputs for size of square = 5 (5x5)
	 	User inputs values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
	 	Output:
	 	[1  2  3  4  5]
	 	[6  7  8  9 10]
	 	Not a magic square
	 	
	 6. Template:
	 int ..., ..., ...;
	 int[][] ...;
	 
	 Scanner input = ... ...(...);
	 System.out.println(...);
	 n = input.nextInt();
	 square = ... int[...][...];
	 
	 
	 
	 7. Code:
	 */
        int n, row, col;
        int[][] square;

        
        Scanner input = new Scanner(System.in);
        System.out.println("Size of square (n x n): ");
        n = input.nextInt();
        square = new int[n][n];
        
        System.out.println("Values in the square: ");
            for (row = 0; row < n; row++) {
                for (col = 0; col < n; col++) {
                    square[row][col] = input.nextInt();
                }
            }
            for (row = 0; row < n; row++) {
                for (col = 0; col < n; col++) {
                    System.out.print(square[row][col] + "\t");
                }
                System.out.println();
            }
	}
}

