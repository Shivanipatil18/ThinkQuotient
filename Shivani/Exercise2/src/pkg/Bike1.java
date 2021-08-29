package pkg;

public class Bike1 {

	public static void main(String[] args) {
		Bike b=new Bike();
		Bike b1=new Bike();
		Bike b2=new Bike("Honda");
		
		b.setName("Appache");
		
		System.out.println(b.getName());
		System.out.println(b1.getName());
		System.out.println(b2.getName());
	}
}
