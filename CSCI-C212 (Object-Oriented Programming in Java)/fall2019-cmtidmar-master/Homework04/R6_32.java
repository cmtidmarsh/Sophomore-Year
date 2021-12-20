package homework_04;
import java.util.Random;

public class R6_32 {
	public static void main(String[] args) {
		System.out.println(Random());

		
	}
	public static int Random() {
		Random random = new Random();
		int r = random.nextInt(4);
		double m = r % 15;
		if (m < 2) {
			System.out.print(" The city Harry should go to is Utah. The number is ");
			return 3;
}
		
		else if (m < 3) {
			System.out.print(" The city Harry should go to is Nevada. The number is  ");
			return 2;
}
		
		else {
			System.out.print(" The city Harry should go to is California. The number is  ");
			return 1;
}
		
	
	}

}
