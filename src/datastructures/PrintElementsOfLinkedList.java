package datastructures;

public class PrintElementsOfLinkedList {
	class Node {
		int data;
		Node next;
	}
	
	static void Print(Node head) {
		if (null != head) {
		      System.out.println(head.data);
		      if(null != head.next) {
		          Print(head.next);
		      }
		  }
	}
}
