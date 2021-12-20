import java.util.Random;
public class P6_7 {
	public static void main(String[] arg) {
		System.out.println("Starting location of drunk is (0, 0)");
		Random r = new Random();
		int x = 0; // initial x
		int y = 0;// initial y
		for (int i = 0; i < 101; i++) { // runs it 100 times
			int direction = r.nextInt(4) + 1;  //drunk could either go N, S, E, W.
			switch(direction) { 
			case 1: x = x + 1; // East: moves about x-axis to the right 1 intersection
			break;
			case 2: x = x + (-1); // West: moves about x-axis to the left 1 intersection
			break;
			case 3: y = y - 1; // South: moves about y-axis down 1 intersection
			break;
			case 4: y = y + 1; // North: moves about y-axis up 1 intersection
			break;
			
			}
		}
		System.out.println("Location is (" +x+"," +y+")"); // ending location
	}

}
