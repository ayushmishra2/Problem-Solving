import java.util.Stack;

public class PostfixToPrefix {

	public static void main(String []args) {
		String exp = "ab+cd^e-fgh*+^*i-";
		Stack<String> stack = new Stack<>();
		String second = "",first="",temp = "";
		for(int i=0;i<exp.length();i++) {
			char ch = exp.charAt(i);
			if(!isOperator(ch)) {
				stack.push(ch+"");
			}
			else {
				    if(!stack.isEmpty())
		    		 second = stack.pop();
		    		else break;
		    		if(!stack.isEmpty())
		    		 first = stack.pop();
		    		else break;
		    		if(first != "" && second != "") {
		    		temp = ch + first + second;
		    		stack.push(temp);
		    		System.out.println(ch + " " +temp);
		    		}
		    		else break;
			}
		}
		System.out.print(stack.peek());
	}
    private static boolean isOperator(char ch) {	
		return (!(ch>='A' && ch<='Z') &&
				!(ch>='a' && ch<='z') &&
				!(ch>='0' && ch<='9'));
	}

}
