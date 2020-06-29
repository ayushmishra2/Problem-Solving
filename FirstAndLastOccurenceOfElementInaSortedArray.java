
public class FirstAndLastOccurenceOfElementInaSortedArray {

	public static void main(String []args) {
		int a[] = {1,2,3,3,4,5,5,5,5,6,7,8};
		int element = 5;
		//occurenceIteratively(a,element);
		occurenceBinarySearch(a,0,a.length-1,element);
	}

	private static void occurenceBinarySearch(int[] a, int low, int high, int element) {
		if(low > high) {
			return;
		}
		int first = find1stOccurence(a,low,high,element);
		int last = findLastOccurence(a,low,high,element);
		System.out.print(first+" "+last);
	}

	private static int findLastOccurence(int[] a, int low, int high, int element) {
		if(high>=low) {
			int mid = low + (high-low)/2;
			if((mid == a.length-1 || element < a[mid+1]) && a[mid] == element){
				return mid;
			}
			else if(element < a[mid]) {
				return findLastOccurence(a, low, mid-1, element);
			}
			else return findLastOccurence(a, mid+1, high, element);
		}
		return -1;
	}

	private static int find1stOccurence(int[] a, int low, int high, int element) {
		if(high >= low) {
			int mid = low + (high-low)/2;
			if((mid == 0 || element > a[mid-1]) && a[mid] == element) {
				return mid;
			}
			else if(element > a[mid]) {
				return find1stOccurence(a,mid+1,high,element);
			}
			else return find1stOccurence(a,low,mid-1,element);
		}
		return -1;
	}

	private static void occurenceIteratively(int[] a,int num) {
		int first=-1,last=-1;
		for(int i=0;i<a.length;i++) {
			if(a[i] == num) {
				first = i;
			}
			if(first != -1) {
				while(a[i] == num) {
					i++;
				}
				last = i-1;
				break;
			}
		}
		System.out.print(first+ " "+ last);
	}
}
