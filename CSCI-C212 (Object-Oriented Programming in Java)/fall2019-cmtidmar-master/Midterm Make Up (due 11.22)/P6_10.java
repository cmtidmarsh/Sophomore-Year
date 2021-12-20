import java.util.Random;

public class P6_10 {
	public static void main(String[] args) {
		experiment1();
		experiment2(); 
	}
	
	public static void experiment1() {
		Random r = new Random();
		int n = 100000000;
		int loss = 0;
		int win = 0;
		
		for (int i = 0; i < n; i++){
			boolean  seen_six = false;
			for (int j = 0; j < 4; j++) {
				int die = r.nextInt(6) + 1;
				// if you roll die and it lands on 6 then break and add one win
				if (die == 6){
					seen_six = true;
					break;
				}
			}
			if (seen_six){
				win++;
				}
				else {
					loss++;
			}
			System.out.println("Wins " + win);
			System.out.println("Losses " + loss);
		}
		
		
		
		
		
		
		
	}
	

	public static void experiment2() {
		int n = 100000000;
		int loss = 0;
		int win = 0;
		
		for (int i = 0; i < n; i++){
			boolean  seen_two_six = false;
			for (int j = 0; j < 4; j++) {
				int die1 = r.nextInt(6) + 1;
				int die2 = r.nextInt(6) + 1;
				// if you roll dice and they both are 6 then break and add one win
				if (die1 == 6 && die2 == 6) { 
					seen_two_six = true;
					break;
			}
			if (seen_two_six){
				win++;
				}
				else {
					loss++;
			}
			System.out.println("Wins " + win);
			System.out.println("Losses " + loss);
		}
		
		
		
		
		
		
		
	}
		
		
		
		
	}
	
	

}

