import java.util.Scanner;

public class E6_14 {
	public static void main(String[] arg) {
		Scanner user = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int x = user.nextInt(); 
		while (x != 0) { // while the number user inputs does not equal 0, do x mod 2
			int y = x % 2;
			System.out.println(y); 
			x = x /2; 
		}
	}
}
				
