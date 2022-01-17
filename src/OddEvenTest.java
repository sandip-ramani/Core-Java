
public class OddEvenTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OddEvenThread oe = new OddEvenThread();
		oe.odd = true;
		Thread t1 = new Thread(new Runnable(){
			public void run(){
				oe.even();
			}
		});
		
		Thread t2 = new Thread(new Runnable(){
			public void run(){
				oe.odd();
			}
		});
		t1.start();
		t2.start();
		
		try {
		//	t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
