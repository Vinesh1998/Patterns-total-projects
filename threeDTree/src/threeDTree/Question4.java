package threeDTree;

public class Question4 {

	    public static void main(String[] args) {
	        int[][] r13 = {
	                {5, 2, 2}, {5, 2, 3}, {5, 2, 4}, {5, 2, 5}, {5, 3, 1},
	                {5, 3, 2}, {5, 3, 99}, {7, 4, 3}, {5, 3, 87}, {6, 4, 3},
	                {1, 7, 4}, {5, 4, 3}, {5, 4, 1}
	        };

	        ThreeDTree tr13 = new ThreeDTree();
	        for (int[] record : r13) {
	            tr13.insert(record[0], record[1], record[2]);
	        }

	        System.out.println("Custom traversal for 13 records:");
	        tr13.customTraversal();
	        System.out.println();
	    }
	}









