package revison2;
abstract class Vehicle{
	abstract void start();
	
	public void fuelType() {
		
		System.out.println(" fuel type Vehicle ");
	}
}
class Car extends Vehicle{
	
	public void start() {
		System.out.println(" Diesel Car ");
	}
}
class Bike extends Vehicle{
	
	public void start() {
		System.out.println(" Petrol Bike ");
	}
}

public class AbstractProgram3 {

	public static void main(String[] args) {
		Vehicle v1 = new Car();
		v1.start();
		v1.fuelType();
		
		Vehicle v2 = new Bike();
		v2.start();
		v2.fuelType();

	}

}
