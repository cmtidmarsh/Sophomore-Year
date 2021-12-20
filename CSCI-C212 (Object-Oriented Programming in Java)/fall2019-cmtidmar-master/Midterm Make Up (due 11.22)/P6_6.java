import java.util.Random;
public class P6_6 {	
	public static void main(String[] args) {
	for (int i = 0; i < 10; i++) {
		nim();
	}
	
}
// P6.6: Game of Nim
public static void nim() {
	Random r = new Random();
	int n = r.nextInt(91) + 10; // range of [10, 101) = 10 + [ 0, 91)
	int turn = r.nextInt(2); // o for human player and 1 for computer
	int smart = r.nextInt(2); // 0 is smart and 1 is stupid
	int compTurn = 0; // How many marbles the computer will take
	int myTurn = 0;
	
	while (n > 0) {
		if (turn == 1){
			if (smart == 1) {  // Stupid mode
				compTurn = r.nextInt(n/2 - 1);
			} else { // Smart mode
				if (isPowOfTwo(n + 1)) {
					compTurn = r.nextInt(n/2 - 1);
				}
				else {
					int[] powsOfTwo = new int[] {1, 3, 7, 15, 31, 63};
					int biggestPowOfTwo = 0; 
		
					for (int i = 0; i < 5; i++) {
						if (powsOfTwo[i] >= n) {
							break;
						}
						else {
							biggestPowOfTwo = powsOfTwo[i];
						}
					}
					compTurn = biggestPowOfTwo;
				}
				
				
			}
			n = n - compTurn;

		} else {
			if (myTurn <= n) {
				n = n - myTurn;
			}

			
		}
		}
	}

public static boolean isPowOfTwo(int n) {
	if (n==0)
		return false;

	return (int)(Math.ceil((Math.log(n)/Math.log(2)))) ==
			(int)(Math.floor((Math.log(n)/Math.log(2)))) ;
	
}

}
