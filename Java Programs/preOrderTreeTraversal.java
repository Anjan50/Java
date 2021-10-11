// Java program for PreORDER TREE TRAVERSAL


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

	
	void printPreorder(TreeNode treenode)
	{
		if (treenode == null)
			return;

		/* first print data of treenode */
		System.out.print(treenode.key + " ");

		/* then recur on left subtree */
		printPreorder(treenode.left);

		/* now recur on right subtree */
		printPreorder(treenode.right);
	}


	void printPreorder() { printPreorder(root); }


	public static void main(String[] args)
	{
		BinaryTree preOrderTree = new BinaryTree();
		preOrderTree.root = new TreeNode(1);
		preOrderTree.root.left = new TreeNode(2);
		preOrderTree.root.right = new TreeNode(3);
		preOrderTree.root.left.left = new TreeNode(4);
		preOrderTree.root.left.right = new TreeNode(5);

		System.out.println(
			"Preorder traversal of binary tree is ");
		preOrderTree.printPreorder();
	}
	
}
