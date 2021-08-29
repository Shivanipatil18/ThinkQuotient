package pkg1;

public class Vehicle {
	
	private String Vehicle_Name;
	private int speed;
	
	public Vehicle()
	{
		System.out.println("Type of vehicle: ");
	}
	public String getVehicle_Name() {
		return Vehicle_Name;
	}
	public void setVehicle_Name(String vehicle_Name) {
		Vehicle_Name = vehicle_Name;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	

}
