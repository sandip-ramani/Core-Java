package DesignPattern.factory;

public class ComputerFactory {

	public static Computer getComputer(String type, String RAM, String HDD, String CPU){
		if("PC".equalsIgnoreCase(type)){
			return new PC(RAM, HDD, CPU);
		}
		else if ("Server".equalsIgnoreCase(type)){
			return new Server(RAM, HDD, CPU);
		}
		else{
			return null;
		}
	}
}
