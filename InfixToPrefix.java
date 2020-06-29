import java.util.Stack;

public class InfixToPrefix {

	public static void main(String []args) {
		String exp = "a+b*c^d-e^f+g*h-i";
		Stack<String> operands = new Stack<>();
		Stack<Character> operators = new Stack<>();
		for(int i=0;i<exp.length();i++) {
			char ch = exp.charAt(i);
			if(ch == '(') {
				operators.push(ch);
			}
			else if(ch == ')') {
				while(!operators.isEmpty() && operators.peek() != '(') {
					String op1 = operands.peek();
					operands.pop();
					String op2 = operands.peek();
					operands.pop();
					char op = operators.peek();
					operators.pop();
					String temp = op + op2 + op1;
					operands.push(temp);
				}
				operators.pop();
			}
			else if(!isOperator(ch)) {
				operands.push(ch + "");
			}
			else {
			     while(!operators.isEmpty() && getPriority(ch) <= getPriority(operators.peek())) {
			    	    String op1 = operands.peek();
						operands.pop();
						String op2 = operands.peek();
						operands.pop();
						char op = operators.peek();
						operators.pop();
						String temp = op + op2 + op1;
						operands.push(temp);
			     }
			     operators.push(ch);
			}
		}
		while(!operators.isEmpty()) {
			String op1 = operands.peek();
			operands.pop();
			String op2 = operands.peek();
			operands.pop();
			char op = operators.peek();
			operators.pop();
			String temp = op + op2 + op1;
			operands.push(temp);
		}
		
		System.out.print(operands.peek());
	}

	private static int getPriority(char ch) {
		switch(ch) {
		case '+':
		case '-': return 1;
		case '*':
		case '/': return 2;
		case '^': return 3;
		}
		return 0;
	}

	private static boolean isOperator(char ch) {
		
		return (!(ch >= 'A' && ch <= 'Z')&&
				!(ch >= 'a' && ch <= 'z')&&
				!(ch >= '0' && ch <= '9'));
	}
}
