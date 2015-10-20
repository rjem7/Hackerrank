package datastructures;

public class PostorderTreeTraversal {
	static class Node {
		int data;
		Node left;
		Node right;
	}
	
	static void Postorder(Node root) {
		if(null != root) {	        
	        if(null != root.left) {
	            Postorder(root.left);
	        }
            	        
	        if(null != root.right) {
	            Postorder(root.right);
	        }
            
	        System.out.print(root.data);
	        System.out.print(" ");
		}
	}
}
