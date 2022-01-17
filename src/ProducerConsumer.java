import java.util.Queue;

public class ProducerConsumer {

	Queue q;
	int loop = 10;
	int max =2;
	int count =1;
	public ProducerConsumer(Queue q){
		this.q=q;
	}
	
	public void produce(){
		while(loop > 0){
		synchronized(this){
			while (q.size() == max){
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			q.add(count++);
			loop--;
			System.out.println("object added " + count);
			notify();
		}
		}
	}
	public void consume(){
		while(true){
		synchronized(this){
			while (q.size() == 0){
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			int x = (int) q.remove();
		//	loop--;
			System.out.println("object removed "+x);
			notify();
		}
		}
	}
}
