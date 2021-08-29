package cab_details;

public class Tester {

	public static void main(String[] args) {
		Cab c=new Cab();
		
		//System.out.println(c.getDriverID());
		c.setDriverId(121);
		System.out.println("Driver ID: " +c.getDriverID());
		c.setNoOfPassenger(1);
		System.out.println("Num of Passenger: " +c.getNoOfPassenger());
		c.setPassenegerName("Shiv");
		System.out.println("Passenger Name: " +c.getPassengerName());
		

	}


}
