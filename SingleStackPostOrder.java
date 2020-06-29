import java.util.Stack;

public class SingleStackPostOrder {

	public static void main(String []args) {
		
		Node head = new Node(1);
		head.left = new Node(2);
		head.right = new Node(3);
		head.left.left = new Node(4);
		head.left.right = new Node(5);
		head.right.left = new Node(6);
		head.right.right = new Node(7);
		
		Stack<Node> stack = new Stack<>();
		while(true) {
			while(head != null) {
			stack.push(head);
			stack.push(head);
			head = head.left;
		}
			if(stack.isEmpty()) {
				return;
			}
			head = stack.pop();
			if(!stack.isEmpty() && head == stack.peek()) {
				head = head.right;
			}
			else {
				System.out.print(head.data+" ");
				head = null;
			}
	 }
		
	}
	
	static class Node{
		int data;
		Node left,right;
		
		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
}
