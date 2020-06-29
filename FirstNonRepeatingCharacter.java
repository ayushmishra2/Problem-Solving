
public class FirstNonRepeatingCharacter {

	public static void main(String []args) {
		String str = "ageeksforgeeks";
		str = str.trim();
		int count[] = new int[256];
		for(int i=0;i<str.length();i++) {
			count[str.charAt(i)]++;
		}
		for(int i=0;i<str.length();i++) {
			if(count[str.charAt(i)] == 1) {
				System.out.print(str.charAt(i));
				break;
			}
		}
	}
}
