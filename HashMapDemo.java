import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HashMapDemo {

	int data;
	
	HashMapDemo(int data){
		this.data = data;
	}
	
	public int getData() {
		return this.data;
	}
	
	public static void main(String []args) {
		
		HashMap<T1, Integer> map = new HashMap<>();
		T1 test = new T1(123);
		T1 test1 = new T1(123);
		test.m(null);
		//System.out.print(test.equals(test1));
		map.put(test, 2);
		map.put(test1, 3);
		System.out.println(map);
//		System.out.println(map.get(test));
//		System.out.print(map.get(test1));
		System.out.println(map.size());
		HashMap<Integer, Integer> map1 = new HashMap<>();
		int a[] = {1,1,2,2,2,3,4,4,1};
		for(int i : a) {
		  if(map1.containsKey(i)) {
			  map1.put(i, map1.get(i) + 1);
		  }
		  else {
			  map1.put(i, 1);
		  }
		}
		System.out.print(map1);
//		T1 test = null;
//		test.m1();
		
//		HashMapDemo d = new HashMapDemo(5);
//		d.data = 10;
//		System.out.print(d.getData());
		
	}
}
