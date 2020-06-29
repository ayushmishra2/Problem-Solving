
/* 
 * Input : 1 2 3 4
 *         5 6 7 8
 *         9 10 11 12
 *         13 14 15 16
 * 
 * Output: 1 2 3 4 8 12 16 15 14 13 9 5 6 7 8 11 10 
 * 
 * */

public class SpiralMatrix {

	public static void main(String []args) {
		int a[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int n = 4;
		int top = 0, bottom = n-1, left = 0, right = n-1;
		while(bottom>=top && right>=left) {
			for(int i = left;i<=right;i++) {
				System.out.print(a[top][i]+" ");
			}
			top++;
			for(int i=top;i<=bottom;i++) {
				System.out.print(a[i][right]+" ");
			}
			right--;
			for(int i = right;i>=left;i--) {
				System.out.print(a[bottom][i]+" ");
			}
			bottom--;
			for(int i=bottom;i>=top;i--) {
				System.out.print(a[i][left]+" ");
			}
			left++;
		}
	}
}
