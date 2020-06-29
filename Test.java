
public class Test extends Child {

	private int a;
	
	public Test() {
		a=20;
	}
	
	private int getA() {
		return a;
	}
	public static void main(String []args) {
		Test t = new Test();
		System.out.print(t.getA());
	}
}

class Child {
	private int a;
	public Child() {
		a = 10;
	}
	
}
