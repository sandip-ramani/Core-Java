package multithreading;

public class cyclicDeadlock implements Runnable{

	Object o1;
	Object o2;
	public cyclicDeadlock(Object o1, Object o2){
		this.o1 = o1;
		this.o2 = o2;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+" acquiring the lock"+o1);
		synchronized (o1) {
			System.out.println(Thread.currentThread().getName()+" acquired"+o1);
			work();
			System.out.println(Thread.currentThread().getName()+" acquiring the lock"+o2);
			synchronized (o2) {
				System.out.println(Thread.currentThread().getName()+" acquired"+o2);
				work();
			}
			System.out.println(Thread.currentThread().getName()+" released "+o2);
		}
		System.out.println(Thread.currentThread().getName()+" released "+o1);
	}
	
	public void work(){
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
