
public class HeapSortIncreasing {

	public static void main(String []args) {
		int a[] = {6,3,0,1,10,2,5};
		int n = a.length;
		for(int i=n/2-1;i>=0;i--) {
			heapify(a,n,i);
		}
		
		for(int i=n-1;i>0;i--) {
			int temp = a[0];
			a[0] = a[i];
			a[i] = temp;
			heapify(a,i,0);
		}
		
		for(int i=n-1;i>=0;i--) {
			System.out.print(a[i]+ " ");
		}
	}

	private static void heapify(int[] a, int n, int i) {
		int smallest = i;
		int left = 2*i+1;
		int right = 2*i+2;
		
		if(left < n && a[left] < a[smallest]) {
			smallest = left;
		}
		
		if(right < n && a[right] < a[smallest]) {
			smallest = right;
		}
		
		if(smallest != i) {
			int temp = a[i];
			a[i] = a[smallest];
			a[smallest] = temp;
			heapify(a,n,smallest);
		}
	}
}
