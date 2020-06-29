
public class EquilibriumIndex {

	public static void main(String []args) {
		 int a[] = {1,2,-3,0,2,-5,5,1};
		 System.out.print(equilibriumIndex(a));
	}

	private static int equilibriumIndex(int[] a) {
		// TODO Auto-generated method stub
		int sum = 0;
		int leftSum = 0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		
		for(int i=0;i<a.length;i++) {
			sum-=a[i];
			if(sum == leftSum) {
				return i;
			}
			leftSum+=a[i];
		}
		return -1;
	}
}
