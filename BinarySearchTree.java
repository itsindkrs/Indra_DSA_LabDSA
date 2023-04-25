import java.util.Scanner;

public class BinarySearchTree {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		Node root = null;
		Node nn = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number of nodes");
		int size = sc.nextInt();
		int i;
		for (i = 1; i <= size; i++) {
			System.out.println("Enter Data for the node");
			int item = sc.nextInt();
			new Node(item);
			if (root == null)
				root = nn;
			else
				bst.insert(root, nn);
			System.out.println("PREORDER TRAVERSAL");
			bst.preOrder(root);
			System.out.println("INEORDER TRAVERSAL");
			bst.inOrder(root);
			System.out.println("POSTORDER TRAVERSAL");
			bst.postOrder(root);
		}
	}

	private void insert(Node root, Node nn) {

		if (nn.data < root.data) {
			if (root.left == null)
				root.left = nn;
			else {
				insert(root.left, nn);
			}
			if (root.right == null) {
				root.right = nn;
			}

			else
				insert(root.right, nn);
		}
	}

	private void preOrder(Node root) {
		if (root != null) {
			System.out.println(root.data);
			preOrder(root.left);
			preOrder(root.right);
		}
	}

	private void inOrder(Node root) {
		if (root != null) {
			inOrder(root.left);
			System.out.println(root.data);
			inOrder(root.right);
		}
	}

	private void postOrder(Node root) {
		if (root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.println(root.data);
		}

	}
}
