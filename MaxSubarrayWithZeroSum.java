import java.util.HashMap;
import java.util.Map;

public class MaxSubarrayWithZeroSum {

	public static void main(String []args) {
		int a[] = {15,-2,2,-8,1,7,10};
		Map<Integer, Integer> map = new HashMap<>();
		int sum = 0, max_len=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
			if(a[i] == 0 && max_len==0) {
				max_len = 1;
			}
			
			if(sum == 0) {
				max_len = i+1;
			}
			
			Integer prev = map.get(sum);
			if(prev != null) {
				max_len = (int)Math.max(max_len, i-prev);
				//System.out.println(max_len);
			}
			else {
				map.put(sum, i);
			}
		}
		System.out.print(max_len);
	}
}
