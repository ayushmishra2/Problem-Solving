import java.util.concurrent.atomic.AtomicInteger;

public class PrintAtoZbyTwoThreads {

	static AtomicInteger atomicInteger = new AtomicInteger(65);
	
	public static void main(String []args) {
		Runnable print = () -> {
			while(atomicInteger.get() < 90) {
				synchronized(atomicInteger) {
					if(atomicInteger.get() % 2 != 0 && "Thread1".equals(Thread.currentThread().getName())){
						System.out.println("Thread1" + (char)atomicInteger.getAndIncrement());
					}
					else if(atomicInteger.get() % 2 == 0 && "Thread2".equals(Thread.currentThread().getName())){
						System.out.println("Thread2" + (char)atomicInteger.getAndIncrement());
					}
				}
			}
		};
		Thread t1 = new Thread(print);
		t1.setName("Thread1");
		Thread t2 = new Thread(print);
		t2.setName("Thread2");
		t1.start();
		t2.start();
	}
}
