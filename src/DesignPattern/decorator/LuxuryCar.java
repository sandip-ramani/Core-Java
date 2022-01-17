package DesignPattern.decorator;

public class LuxuryCar extends CarDecorator {

	public LuxuryCar(Car car) {
		super(car);
		// TODO Auto-generated constructor stub
	}

	public void assemble(){
		super.assemble();
		System.out.println("Luxury car feature");
	}
}
