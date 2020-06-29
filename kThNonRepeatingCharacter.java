import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class kThNonRepeatingCharacter {

	static int MAX_CHARS = 256;
	
	public static void main(String []args) {
		String str = "geeeksforgeeks";
		int n = str.length(),k=3;
		int count[] = new int[MAX_CHARS];
		int index[] = new int[MAX_CHARS];
		
		for(int i=0;i<MAX_CHARS;i++) {
			count[i]=0;
			index[i]=n;
		}
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			count[ch]++;
			if(count[ch] == 1) {
				index[ch] = i;
			}
			if(count[ch] == 2) {
				index[ch] = n;
			}
		}
		Arrays.sort(index);
		if(index[k-1] != n) {
			System.out.print(str.charAt(index[k-1]));
		}
		else {
			System.out.print("No Character");
		}
	}
}
