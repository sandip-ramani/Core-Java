package DesignPattern.composite;
//This is called a leaf object
public class Triangle implements Shape {

	@Override
	public void draw(String fillcolor) {
	System.out.println("Triangle with colour "+fillcolor);

	}

}
