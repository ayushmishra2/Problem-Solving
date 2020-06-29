/* 
 * Two linked list are in ascending order. Merge both the linked list in descending order
 * 
 * Ex: 1->4->7->10 , 2->3->5->8
 * o/p: 10->8->7->5->4->3->2->1->null
 * 
 * */
public class MergeTwoLinkedListinDescendingOrder {

	static class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public static void main(String []args) {
		Node head1 = new Node(1);
		head1.next = new Node(2);
		head1.next.next = new Node(7);
		head1.next.next.next = new Node(10);
		
		Node head2 = new Node(2);
		head2.next = new Node(3);
		head2.next.next = new Node(5);
		head2.next.next.next = new Node(8);
		
		Node head = null;
		
		while(head1 != null && head2 != null) {
			if(head1.data <= head2.data) {
				Node temp = head1.next;
				head = reverse(head, head1);
				head1 = temp;
			}
			else {
				Node temp = head2.next;
				head = reverse(head, head2);
				head2 = temp;
			}
		}
		while(head != null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
	}

	private static Node reverse(Node head, Node recur) {
		recur.next = head;
		head = recur;
		return head;
	}
}
