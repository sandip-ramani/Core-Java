package DesignPattern.composite;

public class CompositionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle tr1 = new Triangle();
		Triangle tr2 = new Triangle();
		Circle cr = new Circle();
		
		Drawing drawing = new Drawing();
		drawing.add(tr1);
		drawing.add(tr2);
		drawing.add(cr);
		
		drawing.draw("red");
		
	}

}
