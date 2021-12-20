package lab06;

import java.util.ArrayList;

public class Problem4 {

	public static void main(String[] args) {
		/*
	 1. Data Representation: 
	 	- Array
	 	- row
	 	- column
	 	- n = values
	 	- row{n}
	 	- column{n}
	 	
	 2. Examples of Data Representation:
	 	- row = {1, 2, 3, 4, 5}
	 	- column = {6, 7, 8, 9, 10}
	 
	 3. Name of Function: Square
	 	Signature: int[] square = new int[10];
	 	
	 4. Purpose: The purpose is to make a magic square using an array.
	 
	 5. Examples of how function will work:
	 	User inputs for size of square = 5 (5x5)
	 	User inputs values: {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
	 	Output:
	 	{1  2  3  4  5}
	 	{6  7  8  9 10}
	 	Not a magic square
	 	
	 6. Template:
	 	int i, j;
	    int[][] square = { {...}, {...}};
        ArrayList<ArrayList<Integar>> n;
        Object ...;
        a = new Object();
        for (int ...; ...; ...) {
        	ArrayList<....> ...;
            row = new ArrayList<...>();
            for (int ...; j < square[...].length; ...)
            	row.add(square[...][...]);
           
        }
	}
	 
	 7. Code:
	 */
		int i, j;
        int[][] square = { {1, 2, 4, 5}, {6, 7, 8, 9, 10}};
        ArrayList<ArrayList<Integar>> n;
        Object a;
        a = new Object();
        for (int i = 0; i < square.length; i++) {
        	ArrayList<Integer> row;
            row = new ArrayList<Integer>();
            for (int j = 0; j < square[i].length; j++)
            	row.add(square[i][j]);
           
        }
	}
}
