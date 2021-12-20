package homework_03;

public class CounterTester {
	// Testing R3.17: Provide a unit test class for the Counter class in Section 3.1.
	

	public static void main(String[] args) {
		Counter tally = new Counter();
		tally.click();
		tally.click();
		tally.click();
		tally.click();
		tally.click();
		System.out.println("Num of Clicks: " + tally.getValue());
		tally.reset();
		System.out.println("Num of Clicks: " + tally.getValue());
		
		
		

	}

}
