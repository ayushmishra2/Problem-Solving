import java.util.Stack;

public class PrefixToInfix {

	public static void main(String []args) {
		String exp = "-+-+a*b^cd^ef*ghi";
		Stack<Character> operators = new Stack<>();
		String result = "";
		int i;
		for(i=0;i<exp.length();i++) {
			char ch = exp.charAt(i);
			if(isOperator(ch)) {
				operators.push(ch);
			}
			else {
				result += ch;
				if(!operators.isEmpty()) {
					result += operators.pop();
				}
			}
		}
		System.out.print(result);
	}
    private static boolean isOperator(char ch) {	
		return (!(ch>='A' && ch<='Z') &&
				!(ch>='a' && ch<='z') &&
				!(ch>='0' && ch<='9'));
	}
}
