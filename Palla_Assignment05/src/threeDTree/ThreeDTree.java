package threeDTree;
	import java.util.Arrays;

	public class ThreeDTree {
		    Node root;

		   

		    public void insert(int k1, int k2, int k3) {
		        root = insert(root, k1, k2, k3, 0);
		    }

		    private Node insert(Node node, int k1, int k2, int k3, int depth) {
		        if (node == null) {
		            return new Node(k1, k2, k3);
		        }

		        int key = node.keys[depth % 3];
		        int newKey = (depth % 3 == 0) ? k1 : (depth % 3 == 1) ? k2 : k3;

		        if (newKey < key) {
		            node.left = insert(node.left, k1, k2, k3, depth + 1);
		        } else if (newKey > key) {
		            node.right = insert(node.right, k1, k2, k3, depth + 1);
		        } else {
		            node.horizontal = insert(node.horizontal, k1, k2, k3, depth + 1);
		        }

		        return node;
		    }
		    public ThreeDTree() {
		        root = null;
		    }
		    public void customTraversal() {
		        customTraversal(root);
		    }

		    private void customTraversal(Node node) {
		        if (node == null) {
		            return;
		        }

		        customTraversal(node.left);

		        if (node.horizontal == null) {
		            System.out.println(Arrays.toString(node.keys));
		        } else {
		            Node currentNode = node;
		            while (currentNode != null) {
		                System.out.println(Arrays.toString(currentNode.keys));
		                currentNode = currentNode.horizontal;
		            }
		        }

		        customTraversal(node.right);
		    }

		    public void inorderTraversal() {
		        inorderTraversal(root, "");
		    }

		    private void inorderTraversal(Node node, String prefix) {
		        if (node != null) {
		            inorderTraversal(node.left, prefix + "    ");
		            System.out.println(prefix + Arrays.toString(node.keys));
		            inorderTraversal(node.horizontal, prefix + " -> ");
		            inorderTraversal(node.right, prefix + "    ");
		        }
		    }
		}






