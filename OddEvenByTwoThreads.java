import java.util.concurrent.atomic.AtomicInteger;

public class OddEvenByTwoThreads {

	static AtomicInteger atomicInteger = new AtomicInteger(1);
	public static void main(String []args) {
		Runnable print = () -> {
			while(atomicInteger.get() < 10) {
				synchronized(atomicInteger) {
					if(atomicInteger.get() % 2 == 0 && "Even".equals(Thread.currentThread().getName())) {
						System.out.println("Even" + atomicInteger.getAndIncrement());
					}
					else if(atomicInteger.get() % 2 != 0 && "Odd".equals(Thread.currentThread().getName())) {
						System.out.println("Odd" + atomicInteger.getAndIncrement());
					}
				}
			}
		};
		
		Thread t1 = new Thread(print);
		t1.setName("Even");
		Thread t2 = new Thread(print);
		t2.setName("Odd");
		t1.start();
		t2.start();
	}
}
