package DesignPattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape {

	private List<Shape> shapes = new ArrayList<Shape>();
	
	@Override
	public void draw(String fillcolor) {
		for (Shape shape : shapes) {
			shape.draw(fillcolor);
		}
	}
	
	public void add(Shape s){
		shapes.add(s);
	}
	public void remove(Shape s){
		shapes.remove(s);
	}

}
