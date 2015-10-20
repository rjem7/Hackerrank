package datastructures;

public class HeightOfABinaryTree {
	
	class Node {
		int data;
		Node left;
		Node right;
	}
	
	static int height = 0;
	
	static int height(Node root) {
		if(null != root) {
			if(null != root.left) {
				height++;
				height(root.left);
			}
			else if(null != root.right) {
				height++;
				height(root.right);
			}
		}
		
		return height;
	}

}
