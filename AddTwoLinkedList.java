
public class AddTwoLinkedList {

	static class Node {
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
		
		@Override
		public String toString() {
			Integer i = new Integer(this.data);
			return i.toString();
		}
	}
	
	public static void main(String []args) {
		Node list1 = new Node(3);
		list1.next = new Node(6);
		list1.next.next = new Node(5);
	//	reverse(list1);
		//printNode(reverse(list1));
		
		Node list2 = new Node(9);
		list2.next = new Node(4);
		list2.next.next = new Node(8);
		
		Node sumList = addTwoLinkedList(list1, list2);
		printNode(sumList);
	}
	
	private static void printNode(Node sumList) {
		while(sumList!=null) {
			System.out.print(sumList.data + "->");
			sumList = sumList.next;
		}
		System.out.print("null");
		
	}

	private static Node addTwoLinkedList(Node list1, Node list2) {
		
		if(list1 == null) return list2;
		if(list2 == null) return list1;
		
		Node operand1 = reverse(list1);
		Node operand2 = reverse(list2);
		
		int c=0, sum; Node prev=null, head = operand1;
		while(operand1 != null && operand2 != null) {
			sum = c + operand1.data + operand2.data;
			operand1.data = sum%10;
			c = sum/10;
			prev = operand1;
			System.out.println(prev);
			operand1 = operand1.next;
			operand2 = operand2.next;
		}
		
		if(operand1 != null || operand2 != null) {
			if(operand2 != null) {
				prev.next = operand2;
			}
			operand1 = prev.next;
			while(operand1 != null) {
				sum = c + operand1.data;
				operand1.data = sum % 10;
				c = sum/10;
				prev = operand1;
				operand1 = operand1.next;
			}
		}
		if(c > 0) {
			prev.next = new Node(c);
		}
	    return reverse(head);	
	}

	public static Node reverse(Node head) {
		if(head == null || head.next == null) {
			return head;
		}
		Node prev = null;
		while(head != null) {
			Node curr = head.next;
			head.next = prev;
			prev = head;
			head = curr;
		}
		return prev;
	}
}
