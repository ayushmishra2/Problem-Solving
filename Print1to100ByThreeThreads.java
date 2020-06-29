import java.util.concurrent.atomic.AtomicInteger;

public class Print1to100ByThreeThreads {

	static AtomicInteger atomicInteger = new AtomicInteger(1);
	
	public static void main(String []args) {
		Runnable print = () -> {
			while(atomicInteger.get() < 100) {
			synchronized(atomicInteger) {
				if(atomicInteger.get() % 3 == 1 && "Thread1".equals(Thread.currentThread().getName())) {
					System.out.println("Thread1 " + atomicInteger.getAndIncrement());
				}
				else if(atomicInteger.get() % 3 == 2 && "Thread2".equals(Thread.currentThread().getName())) {
					System.out.println("Thread2 " + atomicInteger.getAndIncrement());
				}
				else if(atomicInteger.get() % 3 == 0 && "Thread3".equals(Thread.currentThread().getName())) {
					System.out.println("Thread3 " + atomicInteger.getAndIncrement());
				}
			}
		}
	};
		
		Thread t1 = new Thread(print);
		t1.setName("Thread1");
		Thread t2 = new Thread(print);
		t2.setName("Thread2");
		Thread t3 = new Thread(print);
		t3.setName("Thread3");
		t1.start();
		t2.start();
		t3.start();
	}
}
