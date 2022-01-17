package DesignPattern;

public class SingletonTest {

	public static void main(String[] arg){
		singleton sing = singleton.getInstance();
	}
}

class singleton{
	private static singleton single=null;
	
	private singleton(){}
	
	public static singleton getInstance(){
	if (single == null){
		synchronized(singleton.class){
			if (single == null){
				single= new singleton();
			}
		}
	}
	return single;
	}
}
