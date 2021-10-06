// Java program for InORDER TREE TRAVERSAL


class TreeNode {
	int key;
	TreeNode left, right;

	public TreeNode(int item)
	{
		key = item;
		left = right = null;
	}
}

class BinaryTree {
	// Root of Binary Tree
	TreeNode root;

	BinaryTree() { root = null; }

	
	
	void printInorder(TreeNode treenode)
	{
		if (treenode == null)
			return;

		/* first recur on left child */
		printInorder(treenode.left);

		/* then print the data of treenode */
		System.out.print(treenode.key + " ");

		/* now recur on right child */
		printInorder(treenode.right);
	}



	void printInorder() { printInorder(root); }


	public static void main(String[] args)
	{
		BinaryTree iNOrderTree = new BinaryTree();
		iNOrderTree.root = new TreeNode(1);
		iNOrderTree.root.left = new TreeNode(2);
		iNOrderTree.root.right = new TreeNode(3);
		iNOrderTree.root.left.left = new TreeNode(4);
		iNOrderTree.root.left.right = new TreeNode(5);

		System.out.println(
			"\nPostorder traversal of binary tree is ");
		iNOrderTree.printPostorder();
	}
}
