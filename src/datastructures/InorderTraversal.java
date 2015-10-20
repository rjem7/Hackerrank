package datastructures;

public class InorderTraversal {
	class Node {
		int data;
		Node left;
		Node right;
	}
	
	static void Inorder(Node root) {
		if(null != root) {
			if(null != root.left) {
				Inorder(root.left);
			}
			
			System.out.print(root.data);
			System.out.print(" ");
			
			if(null != root.right) {
				Inorder(root.right);
			}
		}
	}
}
