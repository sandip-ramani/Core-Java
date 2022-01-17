
public class OddEvenThread {

	boolean odd;
	int count = 1;
	int max = 20;
	
	void odd(){
		synchronized (this){
			while (count < max){
				
				while (!odd){
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("Odd "+count);
				count ++;
				odd = false;
				notify();
			}
		}
	}
	void even(){
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		synchronized (this){
			while (count < max){
				
				while (odd){
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("Even "+count);
				count ++;
				odd = true;
				notify();
			}
		}
	}
}
