/* Horizontal and Vertical Sorted array
 * search element in array
 * */
public class SearchElementIn2DArray {

	public static void main(String []args) {
		int a[][] = {{1,5,13,29},{11,16,25,38},{45,49,52,57},{51,54,59,66}};
		int n = 4, element = 1;
		System.out.print(searchElement(a,n,element));
	}

	private static boolean searchElement(int[][] a, int n, int element) {
		int x = 0, y = 3;
		while(x < n && y >= 0) {
			if(a[x][y] == element) {
				System.out.println(x+ " "+y);
				return true;
			}
			if(element > a[x][y]) {
				x++;
			}
			else {
				y--;
			}
		}
		return false;
	}
}
