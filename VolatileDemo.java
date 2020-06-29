
public class VolatileDemo {

	String s = "test";
	volatile boolean b = false;
	public static void main(String []args) throws InterruptedException {
		
		VolatileDemo vd = new VolatileDemo();
		
		Runnable test = ()-> {
			//vd.s = "test1";
			System.out.println(Thread.currentThread().getName());
			vd.b = true;
			System.out.println(Thread.currentThread().getName()+" "+vd.b);
			System.out.println(Thread.currentThread().getName()+" "+vd.s);
		};
		
		Runnable test1 = ()-> {
//			VolatileDemo vd = new VolatileDemo();
			vd.s = "test1";
			System.out.println(Thread.currentThread().getName());
			System.out.println(Thread.currentThread().getName()+" "+vd.s);
			System.out.println(Thread.currentThread().getName()+" "+vd.b);
		};
		
		Thread t = new Thread(test);
		Thread t1 = new Thread(test1);
		t.start();
		//Thread.sleep(5000);
		t1.start();
	}
}
