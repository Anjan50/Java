// Java program for POSTORDER TREE TRAVERSAL


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
	
	TreeNode root;

	BinaryTree() { root = null; }

	void printPostorder(TreeNode treenode)
	{
		if (treenode == null)
			return;

		// first recur on left subtree
		printPostorder(treenode.left);

		// then recur on right subtree
		printPostorder(treenode.right);

		// now deal with the node
		System.out.print(treenode.key + " ");
	}

	void printPostorder() { printPostorder(root); }


	public static void main(String[] args)
	{
		BinaryTree postOrderTree = new BinaryTree();
		postOrderTree.root = new TreeNode(1);
		postOrderTree.root.left = new TreeNode(2);
		postOrderTree.root.right = new TreeNode(3);
		postOrderTree.root.left.left = new TreeNode(4);
		postOrderTree.root.left.right = new TreeNode(5);

		System.out.println(
			"\nPostorder traversal of binary tree is ");
		postOrderTree.printPostorder();
	}
}
