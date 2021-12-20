import java.util.Random;
public class P6_9 {
	public static void main(String[] args) {
		buffon();
	}
	// P6.9
	public static void buffon() {
		double n = 10000; // initialize a variable to 10,000 b/c variable = tries
		double hits = 0; // initialize the # of hits to 0 (Starting)
		
		
		Random r = new Random(); // initialize the random function bc you must generate two random numbers
		for (int i = 0; i < n; i++) {
			double y_low = 2 * r.nextDouble(); // random double between 0 and 2
			double angle = 180 * r.nextDouble(); // random double between 0 and 180
			double y_high = y_low +  Math.sin(Math.toRadians(angle));
			if (y_high >= 2) { // "The needle is a hit if yhigh is at least 2"
				hits++; // if yhigh is at least 2, add a hit
				
			}
		}
		System.out.println(n / hits); // "Print the quotient of trues / hits"
	}
	
	
	

}



