
public class MaximumSumLengthNonOverlappingSubArrayContiguouswithkasMaxElement {

	public static void main(String []args) {
		int a[] = {2, 1, 4, 9, 2, 3, 8, 3, 4};
		int k=4;
		int count,flag,ans=0;
		int n=a.length;
		for(int i=0;i<n;) {
			count = 0;
			flag = 0;
			while(i<n && a[i]<=k) {
				count++;
				if(a[i] == k) {
					flag = 1;
				}
				i++;
			}
			
			if(flag == 1) {
				ans+=count;
			}
			
			while(i<n && a[i]>k) {
				i++;
			}
		}
		System.out.print(ans);
	}
}
