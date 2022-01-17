package DesignPattern.factory.abstractFactory;

import DesignPattern.factory.Computer;

public class ComputerFactory {

	public static Computer getComputer(ComputerAbstractFactory abFactory){
		return abFactory.createComputer();
	}
}
