package homework_12;
import java.lang.Math;
import java.util.Scanner;

public class P19_2 {
		   public static void main(String[] args) {
			   long num; 
			   Scanner userInput = new Scanner(System.in);
			   System.out.println("Enter a number: ");    
			   num = userInput.nextInt();                
			   
			   double perfectSquare;
			   long i = 1;
			   long p = 1;
			   System.out.println("The perfect square nums are: ");
			   while(i < num) {
				   perfectSquare = Math.pow(p, 2);
				   if(palindrome ((long) perfectSquare)) {
					   System.out.printf("%.0f ", perfectSquare);
					   i++; }
				   p++; }
		   }

		public static boolean palindrome(long num) { //check whether the user's input is a palindrome 
		long nums = 0, rem, temp;
		temp = num;
		while(temp != 0 ){
			rem = temp % 10;
			nums = nums * 10 + rem;
			temp /= 10; }
		if (num == nums) { return true; }
		else { return false; }
		}
	}