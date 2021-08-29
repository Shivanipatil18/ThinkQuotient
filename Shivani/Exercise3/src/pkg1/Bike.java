package pkg1;

public class Bike extends Vehicle
{
	public Bike()
	{
		super();
		System.out.println("Bike");
	}
	public void disdata()
	{
		System.out.println("Vehicle Name: "+super.getVehicle_Name());
		System.out.println("Speed: "+super.getSpeed());
	}

}