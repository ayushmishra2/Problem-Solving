
public class LoopinLinkedList {

	public static void main(String []args) {
		
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(6);
		//head.next.next.next.next.next.next = head.next.next;
		head.next.next.next.next.next.next = head.next.next.next;
		
	//	reverse(head);
		detectLoop(head);
	//	detectAndRemoveLoop(head);
	}
	
	private static void detectLoop(Node head) {
		Node slow_p = head, fast_p = head; 
        while (slow_p != null && fast_p != null && fast_p.next != null) { 
            slow_p = slow_p.next; 
            fast_p = fast_p.next.next; 
            if (slow_p == fast_p) { 
            	removeLoop(slow_p, head);
                System.out.println("Found loop"); 
                break;
            } 
        } 
        return; 
	}
	
	static void detectAndRemoveLoop(Node node) 
    { 
  
        // If list is empty or has only one node 
        // without loop 
        if (node == null || node.next == null) 
            return; 
  
        Node slow = node, fast = node; 
  
        // Move slow and fast 1 and 2 steps 
        // ahead respectively. 
        slow = slow.next; 
        fast = fast.next.next; 
  
        // Search for loop using slow and fast pointers 
        while (fast != null && fast.next != null) { 
            if (slow == fast) 
                break; 
  
            slow = slow.next; 
            fast = fast.next.next; 
        } 
  
        /* If loop exists */
        if (slow == fast) { 
        	System.out.println(fast.data);
            slow = node; 
            while (slow.next != fast.next) { 
                slow = slow.next; 
                fast = fast.next; 
                System.out.println(slow.data+" "+fast.data);
            } 
  
            /* since fast->next is the looping point */
            fast.next = null; /* remove loop */
        } 
        while(node != null) {
        	//System.out.print(node.data+ " ");
        	node = node.next;
        }
    } 

	private static void removeLoop(Node slow_p, Node head) {
		Node curr = slow_p;
		Node first = head;
		while(curr.next != first.next) {
			curr = curr.next;
			first = first.next;
			System.out.println(first.data+" "+curr.data);
		}
		curr.next = null;
		while(head != null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
	}

//	private static void reverse(Node head) {
//		Node curr = head, prev=null,forward;
//		while(curr != null) {
//			forward = curr.next;
//			curr.next = prev;
//			prev = curr;
//			curr = forward;
//		}
//		
//		while(prev != null) {
//			System.out.print(prev.data+"->");
//			prev = prev.next;
//		}
//	}

	static class Node {
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
}
