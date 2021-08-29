package cab_details;

public class Cab {
	private int driver_id;
	private int no_of_passenger;
	private String passenger_name;
	
	 /*public Cab(int a,int b) {
		 driver_id=a;
		 no_of_passenger=b;
	 }*/
	public void setDriverId(int driver_id)
	{
		this.driver_id=driver_id;
	}
	public int getDriverID()
	{
		return driver_id;
	}
	public void setNoOfPassenger(int no_of_passenger)
	{
		this.no_of_passenger=no_of_passenger;
	}
	public int getNoOfPassenger()
	{
		return no_of_passenger;
	}
	public void setPassenegerName(String passenger_name)
	{
		this.passenger_name=passenger_name;
	}
	public String getPassengerName()
	{
		return passenger_name;
	}
	
}
