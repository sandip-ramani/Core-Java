import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class SenderReceiver {

	private boolean transfer = true;
	BlockingQueue q;
	AtomicInteger i= new AtomicInteger(1);
	int maxEleemnt =10;
	public SenderReceiver(BlockingQueue q){
		this.q= q;
	}
	
	public void send(){
		while (maxEleemnt > 0){
		synchronized(this){
			
			while(!q.isEmpty()){
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			transfer = false;
			try {
				q.put(i.incrementAndGet());
				System.out.println("element added");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			maxEleemnt--;
			notifyAll();
		}
		}
	}
	
public void receive(){
		while(true){
		synchronized(this){
			
			while(q.isEmpty()){
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			transfer = true;
			
			System.out.println("fetched element "+q.poll());
			
			notifyAll();
		}
	}
}
}
