package DesignPattern.factory.abstractFactory;

import DesignPattern.factory.Computer;

public class TestAbstractFactory {

	public static void main(String[] args) {
		
		Computer pc = ComputerFactory.getComputer(new PCFactory("5gb", "500", "Intel"));

	}

}
