import java.util.HashMap;
import java.util.Map;

public class FrequencyInArray {

	public static void main(String []args) {
		int a[] = {2,2,3,3,2,3,3,2,1};
		int n = a.length;
		int i = 0;
		while(i<n) {
			if(a[i] <= 0) {
				i++;
				continue;
			}
			int elementIndex = a[i]-1;
			if(a[elementIndex] > 0) {
				a[i] = a[elementIndex];
				a[elementIndex] = -1;
			}
			else {
				a[elementIndex]--;
				a[i] = 0;
				i++;
			}
		}
		for(int j=0;j<n;j++) {
			if(Math.abs(a[j])>0)
			System.out.println((j+1) +"-----"+ Math.abs(a[j]));
		}
	}
	
}
