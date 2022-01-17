import java.util.Queue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class ProdConsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new PriorityBlockingQueue<Integer>();
		ProducerConsumer pc = new ProducerConsumer(q);
		Thread t1 = new Thread(new Runnable(){
			public void run(){
				pc.produce();
			}
		});
		Thread t2 = new Thread(new Runnable(){
			public void run(){
				pc.consume();;
			}
		});
		
		t1.start();
		t2.start();
	}

}
