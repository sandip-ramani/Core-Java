package DesignPattern.bridge;
//this is an abstraction to decouple Implementation (Car & Bike) from the (Produce & assemble)
//by using composition of their parent interface into Abstraction
// Now Vehicle can vary without worrying about Workshop & vice versa
/*
 It is used when the absraction & implementation both have different hierarchy and 
 we want to hide the implementation
 */
public abstract class Vehicle {

	Workshop workshop1;
	Workshop workshop2;
	
	public Vehicle(Workshop workshop1, Workshop workshop2){
		this.workshop1=workshop1;
		this.workshop2=workshop2;
	}
	
	public abstract void manufacture();
}
