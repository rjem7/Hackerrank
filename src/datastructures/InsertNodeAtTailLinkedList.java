package datastructures;

public class InsertNodeAtTailLinkedList {
	class Node {
		int data;
		Node next;
	}
	
	static Node Insert(Node head, int data) {
		Node node = new InsertNodeAtTailLinkedList().new Node();
		  node.data = data;
		  
		  if(null == head) {
		      head = node;
		  }
		  else if(null == head.next) {
		      head.next = node;
		  }
		  else {
		      Insert(head.next, data);
		  }
		    
		  return head;
	}
}
