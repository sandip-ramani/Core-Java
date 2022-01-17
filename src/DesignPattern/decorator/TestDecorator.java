package DesignPattern.decorator;

/*
 * Decorator method provide runtime functionality, as you can see luxycar getting feature on demand
 */
public class TestDecorator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new LuxuryCar(new SportCar(new BasicCar()));
		car.assemble();
	}

}
