package lab06;
import java.util.Scanner;


public class P7_6 {
	public static void main(String[] args) {
		System.out.println("Enter an odd number: ");
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int[][] square = new int[n][n]; 
		int row = n -  1; 
		int column = n/2; 		
		
		for (int k = 1; k <= n * n; k++) { 
		  square[row][column] = k;  
		  int a = (row + 1) % n; 
		  int b = (column + 1) % n; 
		  if (square[a][b] == 0) { 
		    row = a; 
		    column = b; 
		  } 
		  else { 
		    row = row - 1; 
		   
		  } 
		} 
	       System.out.println("The Magic Square for "+n+":"); 
	        for(row = 0; row < n; row++) { 
	            for(column = 0; column < n; column++) 
	                System.out.print(square[row][column]+ "\t"); 
	            System.out.println(); 
	        }
	}
}
