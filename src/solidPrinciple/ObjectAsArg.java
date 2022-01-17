package solidPrinciple;

public class ObjectAsArg {

	public void foo(StringBuffer s){
		System.out.println("Test2");
	}
	public void foo(Object s){
		System.out.println("tets");
	}
	
	
	public static void main(String[] args){
		new ObjectAsArg().foo(null);
	}
}
