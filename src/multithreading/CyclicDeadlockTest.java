package multithreading;

public class CyclicDeadlockTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object o1 = new Object();
		Object o2 = new Object();
		Object o3 = new Object();
		
		Thread t1 = new Thread(new cyclicDeadlock(o1, o2), "t1");
		Thread t2 = new Thread(new cyclicDeadlock(o2, o3), "t2");
		Thread t3 = new Thread(new cyclicDeadlock(o3, o1), "t3");
		t1.start(); t2.start();t3.start();
		
	}

}
