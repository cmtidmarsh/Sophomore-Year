package lab06;
import java.util.Scanner;
import java.util.*;

import java.io.*;

public class P7_5 {
    public static void main(String[] args) {
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
            
            if (isMagic(square, n)) {
                System.out.println("Square is magic");
            } 
            else {
                System.out.println("Square is not magic");
            }
        }

   

    public static boolean isMagic(int square[][], int n) {
        int row, col, p, t; //row = row, col = column, p = previous, t = total
        p = 0;
        for (row = 0; row < n; row++) {
            t = 0;
            for (col = 0; col < n; col++) {
                t = t + square[row][col];
            }
            if (p == 0) {
                p = t;
            } 
           else if (p != t) {
                return false;
            }
        }
        for (col = 0; col < n; col++) {
            t = 0;
            for (row = 0; row < n; row++) {
                t = t + square[row][col];
            }
        }
        t = 0;
        for (row = 0; row < n; row++) {
            t = t + square[row][row];
        }

        t = 0;
        for (row = 0; row < n; row++) {
            t = t + square[row][n - row - 1];
        }

        return true;
    }
}


