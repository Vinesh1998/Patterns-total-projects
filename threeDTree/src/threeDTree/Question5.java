package threeDTree;
import java.util.Random;

public class Question5 {

	    public static void main(String[] args) {
	        
	        int[] pN10 = generateRandomPH(10);
	        int[] pN100 = generateRandomPH(100);
	        int[] pN500 = generateRandomPH(500);

	        Node r10 = construct3DTree(pN10);
	        Node r100 = construct3DTree(pN100);
	        Node r500 = construct3DTree(pN500);

	        System.out.println("Traversal of 3-d tree with 10 phone numbers:");
	        inorderTraversal(r10);
	        System.out.println();
	        
	        System.out.println("Traversal of 3-d tree with 100 phone numbers:");
	        inorderTraversal(r100);
	        System.out.println();
	        
	        System.out.println("Traversal of 3-d tree with 500 phone numbers:");
	        inorderTraversal(r500);
	        System.out.println();
	    }

	    public static int[] generateRandomPH(int n) {
	        int[] pns = new int[n];
	        Random rand = new Random();
	        for (int i = 0; i < n; i++) {
	            int area = rand.nextInt(900) + 100;
	            int md = rand.nextInt(900) + 100;
	            int ld = rand.nextInt(9000) + 1000;
	            int phoneNumber = area * 10000000 + md * 10000 + ld;
	            pns[i] = phoneNumber;
	        }
	        return pns;
	    }

	 
	    public static Node insert(Node root, int pn) {
	        if (root == null) {
	            return new Node(pn);
	        }
	        if (root.compareTo(pn) == 0) {
	            root.addDuplicate(pn);
	        } else if (root.compareTo(pn) > 0) {
	            root.left = insert(root.left, pn);
	        } else {
	            root.right = insert(root.right, pn);
	        }
	        return root;
	    }
	    public static Node construct3DTree(int[] ps) {
	        Node root = null;
	        for (int ph : ps) {
	            root = insert(root, ph);
	        }
	        return root;
	    }


	    public static void inorderTraversal(Node root) {
	        if (root == null) {
	            return;
	        }
	        inorderTraversal(root.left);
	        System.out.print(root.toString() + " ");
	        if (root.horizontal != null) {
	            inorderTraversal(root.horizontal);
	        }
	        inorderTraversal(root.right);
	    }

	    public static class Node implements Comparable<Node> {
	        int k1;
	        int k2;
	        int k3;
	        Node left;
	        Node right;
	        Node horizontal;

	        public Node(int PH) {
	        
	            k1 = PH / 10000000;
	            k2 = (PH / 10000) % 1000;
	            k3 = PH % 10000;
	        }

	        public void addDuplicate(int pn) {
	            if (horizontal == null) {
	                horizontal = new Node(pn);
	            } else {
	                horizontal.addDuplicate(pn);
	            }
	        }

	        public int compareTo(int pn) {
	            if (k1 != pn / 10000000) {
	                return Integer.compare(k1, pn / 10000000);
	            } else if (k2 != (pn / 10000) % 1000) {
	                return Integer.compare(k2, (pn / 10000) % 1000);
	            } else {
	                return Integer.compare(k3, pn % 10000);
	            }
	        }

	        public String toString() {
	            StringBuilder sb = new StringBuilder();
	            sb.append("(");
	            sb.append(k1);
	            sb.append("-");
	            sb.append(k2);
	            sb.append("-");
	            sb.append(k3);
	            sb.append(")");
	            if (horizontal != null) {
	                sb.append("[");
	                sb.append(horizontal.toString());
	                sb.append("]");
	            }
	System.out.println();
	            return sb.toString();
	        }

			@Override
			public int compareTo(Node o) {
				return 0;
			}
	    }}




