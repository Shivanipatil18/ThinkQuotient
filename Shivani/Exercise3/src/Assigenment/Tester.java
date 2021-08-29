package Assigenment;

public class Tester {

	public static void main(String[] args) {
		SonyTv s=new SonyTv();
		
		System.out.println(s.isOn());
		System.out.println(s.isOff());
		System.out.println(s.getVolume());
		s.turnOn();
		s.increaseVolume();
		s.increaseVolume();
		s.increaseVolume();
		System.out.println(s.getVolume());
		System.out.println(s.isOn());
		System.out.println(s.isOff());
		s.decreseVolume();
		s.decreseVolume();
		s.decreseVolume();
		s.decreseVolume();
		s.decreseVolume();
		System.out.println(s.getVolume());
		System.out.println(s.isOn());
		System.out.println(s.isOff());
	}

}
