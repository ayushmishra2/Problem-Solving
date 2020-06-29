import java.util.Arrays;

public class MinimumDifferenceBetweenTwoElements {

	public static void main(String []args) {
		int a[] = {5,-5,0,0,9,2};
		int minDiff = Integer.MAX_VALUE;
		Arrays.sort(a);
		for(int i=1;i<a.length;i++) {
			int diff = (int)Math.abs(a[i]-a[i-1]);
			if(diff < minDiff) {
				minDiff = diff;
			}
		}
		System.out.print(minDiff);
	}
}
