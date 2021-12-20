/*
 * The following method was known to the ancient Greeks for computing squareroots. Given a 
 * value x>0 and a guess g for the square root, a better guess is (g +x/g)/2. Write a
 * recursive helper method public static squareRootGuess(double x, double g) with the better guess. If g^2 is 
 * approximately equal to x, return g, otherwise, return squarerootGuess with the better guess.  Then write a 
 * method public static squareRoot(double x) that uses the helper method.
 */

import java.util.Scanner;
public class E13_13 {

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double x = user.nextDouble();
        System.out.println("The square root is " + squareRoot(x));

    }


    public static double squareRoot(double x){
        return squareRootGuess(x, 1); 
        }

    private static double squareRootGuess(double x, double g){
        final double value = 0.001;
        if (Math.abs(x-(g*g)) < value){
        	return g;
        	}
        else {
            g = (g + x/g)/2;

        return squareRootGuess(x,g);
        }

    }

}
