package com.app;

public class Side {

	public static void main(String[] args) {
		
		Rectangle r = new Rectangle();
		
		r.setLength(14);
		System.out.println("Length is: "+r.getLength());
		r.setWidth(8);
		System.out.println("Width is: "+r.getWidth());
		System.out.println("Area of Rectangle: "+r.getLength()*r.getWidth());
		
	
	}

}
