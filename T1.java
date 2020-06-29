import java.io.IOException;

public class T1 {

	int id;
	public T1(int id) {
		this.id=id;
	}
	@Override
	public boolean equals(Object obj) {
//		if(obj == this) {
//			return true;
//		}
//		else if(this.getClass().getName().equals(obj.getClass().getName())) {
//			T1 t = (T1)obj;
//			if(this.id == t.id) {
//				return true;
//			}
//		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return 1;
	}
	
	public static void m1() {
		System.out.print("print");
	}
	
	public void m(Throwable t) {
		System.out.print("throwable");
	}
	
	public void m(Exception e) {
		System.out.print("exception");
	}
	
    public void m(IOException e) {
    	System.out.print("ioexception");
	}

//    public void m(String e) {
//    	System.out.print("string");
//    }
}
