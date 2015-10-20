package datastructures;

public class PreorderTreeTraversal {
	static class Node {
		int data;
		Node left;
		Node right;
	}
	
	static void Preorder(Node root) {
		if(null != root) {
	        System.out.print(root.data);
	        System.out.print(" ");
	        if(null != root.left) {
	            Preorder(root.left);
	        }
	        
	        if(null != root.right) {
	            Preorder(root.right);
	        }
	    }
	}
}
