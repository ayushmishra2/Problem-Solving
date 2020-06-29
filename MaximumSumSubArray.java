
public class MaximumSumSubArray {

	public static void main(String []args) {
		int a[] = {-4,1,2,-2,0,3,4,8};
		int currentSum = a[0];
		int maxSum = Integer.MIN_VALUE;
		for(int i=1;i<a.length;i++) {
			currentSum = (int)Math.max(a[i], currentSum+a[i]);
			maxSum = (int)Math.max(maxSum, currentSum);
		}
		System.out.print(maxSum);
	}
}
