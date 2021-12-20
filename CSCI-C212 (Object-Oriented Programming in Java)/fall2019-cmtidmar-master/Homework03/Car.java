package homework_03;
/*
Implement a class Car with the following properties. A car has
a certain fuel efficiency (measured in miles/gallon or 
liters/km--pick one) and a certain amount of fuel in the gas tank.
The efficiency is specified in the constructor, and the initial fuel
level is 0. Supply a method drive that simulates driving the car for
certain distance, reducing the amount of gasoline in the fuel tank.
Also supply methods getGasinTank, returning the current amount of
gasoline in the fuel tank, and addGas, to add gasoline to the fuel
tank. Sample usage:

Car myHybrid = new Car(50); // 50 miles per gallon
myHybrid.addGas(20); //Tank 20 gallons
my Hybrid.drive(100); //Drive 100 miles
double gasLeft = myHybrid.getGasInTank(); //Get gas remaining in tank

You may assume that the drive method is never called with a distance
that consumes more than the available gas. Supply a CarTester class
that tests all methods.
*/

public class Car {
	private double drive;
	private double gas;
	private double MPG;

public Car(double mpg) {
	MPG = mpg; // Miles Per Gallon
	gas = 0; // initialize to 0
	drive = 0;  // initialize to 0
	
	}

public void addGas(double amount) {
	gas = gas + amount;

}

public void drive(double distance) {
	drive = drive + distance;
	gas = gas - (distance / MPG);
	
}
public double getGas() {
	return gas;
}
}
