package DesignPattern.bridge;

public class Bike extends Vehicle{

	public Bike(Workshop workshop1, Workshop workshop2) {
		super(workshop1, workshop2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void manufacture() {
		System.out.println("Bike Manufacturing started");
		workshop1.work();
		workshop2.work();
		
	}

	
}
