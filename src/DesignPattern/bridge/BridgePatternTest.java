package DesignPattern.bridge;

public class BridgePatternTest {

	public static void main(String[] args) {
		
		Vehicle v1 = new Car(new Produce(), new Assembly());
		v1.manufacture();
		Vehicle v2 = new Bike(new Produce(), new Assembly());
		v2.manufacture();
	}

}
