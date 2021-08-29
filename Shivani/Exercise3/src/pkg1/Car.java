package pkg1;

public class Car extends Vehicle {
		
	public Car() {
		super();
		System.out.println("Car");
	}
	public void disdata1()
	{
		System.out.println("Vehicle Name: "+super.getVehicle_Name());
		System.out.println("Speed: "+super.getSpeed());
	}

}
