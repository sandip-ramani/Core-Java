package Java8;

@java.lang.FunctionalInterface
public interface FunctionalInterface {

	void print(String s);
	
	default void PrintDefualt(String s){
		System.out.println("Print from default method:"+s);
	}
}
