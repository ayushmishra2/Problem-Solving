import java.util.Stack;

public class PostfixToInfix {

	public static void main(String []args) {
		
		String exp = "ab+cd-*";
		String second = "", first = "", temp = "";
		Stack<String> result = new Stack<>();
	    for(int i=0;i<exp.length();i++) {
	    	char ch = exp.charAt(i);
	    	if(!isOperator(ch)) {
	    		result.push(ch+"");
	    	}
	    	else {
	    		if(!result.isEmpty())
	    		 second = result.pop();
	    		else break;
	    		if(!result.isEmpty())
	    		 first = result.pop();
	    		else break;
	    		if(first != "" && second != "") {
	    		temp = first + ch + second;
	    		result.push(temp);
	    		}
	    		else break;
	    	}
	    }
	    if(result.size() == 1)
	    System.out.print(result.peek());
	    else {
	    	System.out.print("Wrong Expression");
	    }
	}

	private static boolean isOperator(char ch) {
		
		return (!(ch>='A' && ch<='Z') &&
				!(ch>='a' && ch<='z') &&
				!(ch>='0' && ch<='9'));
	}
}
