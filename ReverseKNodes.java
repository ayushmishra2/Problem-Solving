 
public class ReverseKNodes {

	static class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public static void main(String []args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(6);
		
		Node newHead = reverseKnode(head, 3);
		printNode(newHead);
	}

	private static void printNode(Node newHead) {
		while(newHead != null) {
			System.out.print(newHead.data + "->");
			newHead = newHead.next;
		}
		System.out.print("null");
	}

	private static Node reverseKnode(Node head, int k) {
		// TODO Auto-generated method stub
		Node current = head, forward = null, prev = null;
		int count = 0;
		while(current != null && count < k) {
			forward = current.next;
			current.next = prev;
			prev = current;
			current = forward;
			count++;
		}
		
		if(forward != null) {
			head.next = reverseKnode(forward, k);
		}
		return prev;
	}
}
