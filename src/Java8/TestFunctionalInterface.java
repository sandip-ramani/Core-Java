package Java8;

public class TestFunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Started");
		FunctionalInterface f1 = (s)->System.out.println("from a functional interface:"+s);
		f1.print("Sandip");
		f1.PrintDefualt("Sagar");
		
		 new Thread(()->System.out.println("Thread started")).start();
		
	}

	

}
