package pkg;

public class Bike {
	private String name;
	private int speed;
	
	public Bike()
	{
		this.name="KTM";
	}
	public Bike(String name)
	{
		this.name=name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
}