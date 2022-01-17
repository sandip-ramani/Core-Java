import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class SendReceiveTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SenderReceiver SR = new SenderReceiver(new LinkedBlockingQueue<AtomicInteger>());
		Thread t1 = new Thread(new Runnable(){
			public void run(){
				SR.send();
			}
		});
		
		Thread t2 = new Thread(new Runnable(){
			public void run(){
				SR.receive();
			}
		});
		t1.start();
		t2.start();
	}

}
