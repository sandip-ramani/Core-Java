package DesignPattern.decorator;

public class SportCar extends CarDecorator {

	public SportCar(Car car) {
		super(car);
		
	}

	public void assemble(){
		super.assemble();
		System.out.println("Sport car feature");
	}
}
