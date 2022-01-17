package DesignPattern.builder;

public class TestBuilder {

	public static void main(String[] args) {
	Computer comp = new Computer.CompBuilder("500", "Intel").setBluetooth(true).build();
	}

}
