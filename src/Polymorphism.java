
/*Concept:
1. Constructor : parents constructor invoke first then child constructor is invoked
2. Method: Overridden method is invoked from child class. New method added in child, which is not defined in parent class can not be accessed (compile error)
3. Feild variable: if the parent and child has the same variable name, the parent class variable will be accessed
					New variable added in the child class can not be accessed using parent class reference(compile error)

*/
 class A {

	int a = 10;
	public A(){
		System.out.println("parent constructor");
	}
	void test(){
		System.out.println("Parent method");
	}
	
}

class B extends A{
	int a = 20;
	int b = 30;
	public B(){
		System.out.println("child constructor");
	}
	
	void test(){
		System.out.println("Child method");
	}
	void test1(){
		System.out.println("Child method");
	}
	
}

class Polymorphism{
	public static void main (String[] args){
		
		A p = new B();
		System.out.println(p.a);
		p.test();
		
		//Compile time error since these are not defined in parent class and tried to access using parent reference
//		p.test1();
//		System.out.println(p.b);
	
	}
}