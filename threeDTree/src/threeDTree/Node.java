package threeDTree;

public class Node {
	
	    int[] keys;
	    Node left;
	    Node right;
	    Node horizontal;

	    public Node(int k1, int k2, int k3) {
	        keys = new int[]{k1, k2, k3};
	        left = null;
	        right = null;
	        horizontal = null;
	    }
	}


