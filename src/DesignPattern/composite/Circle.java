package DesignPattern.composite;
//This is called a leaf object
public class Circle implements Shape {

	@Override
	public void draw(String fillcolor) {
		System.out.println("Circle with colour "+fillcolor);

	}

}
