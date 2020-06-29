
public class RotateArrayLeft {

	public static void main(String []args) {
		int a[] = {1,2,3,4,5,6,7};
		int d = 5;
		//leftRotateWithTempArray(a,d);
		//leftRotateArrayOneByOne(a,d);
		leftRotateGcd(a,d);
	}

	private static void leftRotateGcd(int[] arr, int d) {
		int gcd = gcd(arr.length,d);
		int n = arr.length;
		  d = d % n; 
	        int i, j, k, temp; 
	        int g_c_d = gcd(d, n); 
	        for (i = 0; i < g_c_d; i++) { 
	            /* move i-th values of blocks */
	            temp = arr[i]; 
	            j = i; 
	            while (true) { 
	                k = j + d; 
	                if (k >= n) 
	                    k = k - n; 
	                if (k == i) 
	                    break; 
	                arr[j] = arr[k]; 
	                j = k; 
	            } 
	            arr[j] = temp; 
	        } 		for(int a=0;a<arr.length;a++) {
			System.out.print(arr[a]+" ");
		}
	}

	private static int gcd(int a, int b) {
		if(b==0) {
			return a;
		}
		return gcd(b, a%b);
	}

	private static void leftRotateArrayOneByOne(int[] a, int d) {
	    d=d%a.length;
		for(int i=1;i<=d;i++) {
			leftRotateByOne(a);
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

	private static void leftRotateByOne(int[] a) {
		int temp = a[0],i;
		for(i = 0;i<a.length-1;i++) {
			a[i] = a[i+1];
		}
		a[i] = temp;
	}

	private static void leftRotateWithTempArray(int[] a,int d) {
		d=d%a.length;
		int temp[] = new int[d];
		for(int i=0;i<d;i++) {
			temp[i] = a[i];	
		}
		for(int i=0;i<a.length-d;i++) {
			a[i] = a[i+d];
		}
		int k=0;
		for(int i=a.length-d;i<a.length;i++) {
			a[i] = temp[k++];
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
