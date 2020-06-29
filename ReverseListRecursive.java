
public class ReverseListRecursive {

	static class Node {
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	public static void main(String []args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		
		Node node = reverse(head);
		printNode(node);
		//int a = 123451234512345;
		String str = "asd";
		System.out.print(str.getClass().getSimpleName() == "String");
	}

	private static void printNode(Node node) {
		while(node != null) {
			System.out.print(node.data + "->");
			node = node.next;
		}
		System.out.print("null");
	}

	private static Node reverse(Node head) {
		if(head == null || head.next == null) {
			return head;
		}
		
		Node newhead = reverse(head.next);
		head.next.next = head;
		head.next = null;
		
		return newhead;
	}
}
