package solidPrinciple;
//Static Method on null object ref
public class StaticMethod {

	public static String test(){
		System.out.println("Method called");
		return "";
	}
	
	public static void main(String[] args){
		StaticMethod t = null;
		System.out.println(t.test());
	}
}
