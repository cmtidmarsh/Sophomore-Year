package homework_03;
/* 
Testing R3.18: Read Exercise E3.12, but do not implement the Car class yet.
Write a tester class that tests a scenario in which gas is added to the car,
the car is driven, more gas is added, and the car is driven again.
Print the actual and expected amount of gas in the tank.
*/


public class Tester {
	public static void main(String[] args) {
		Car Batmobile = new Car(35);
		Batmobile.addGas(10);
		System.out.println("Expected Amount of Gas: " + Batmobile.getGas());
		Batmobile.drive(125);
		System.out.println("Actual Amount of Gas: " + Batmobile.getGas());

		
	}
}

