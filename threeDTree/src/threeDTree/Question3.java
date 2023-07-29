package threeDTree;

public class Question3 {
	    public static void main(String[] args) {
	        int[][] rc10 = {
	                {3, 1, 2}, {1, 2, 2}, {2, 2, 2}, {5, 2, 2}, {4, 1, 2},
	                {5, 1, 1}, {5, 3, 2}, {5, 3, 1}, {5, 3, 3}, {5, 2, 3}
	        };

	        int[][] rc13 = {
	                {5, 2, 2}, {5, 2, 3}, {5, 2, 4}, {5, 2, 5}, {5, 3, 1},
	                {5, 3, 2}, {5, 3, 99}, {7, 4, 3}, {5, 3, 87}, {6, 4, 3},
	                {1, 7, 4}, {5, 4, 3}, {5, 4, 1}
	        };

	        ThreeDTree th10 = new ThreeDTree();
	        for (int[] record : rc10) {
	            th10.insert(record[0], record[1], record[2]);
	        }

	        System.out.println("3-d Tree for 10 records:-");
	        th10.inorderTraversal();
	        System.out.println();

	        ThreeDTree tree13 = new ThreeDTree();
	        for (int[] record : rc13) {
	            tree13.insert(record[0], record[1], record[2]);
	        }

	        System.out.println("3-d Tree for 13 records:-");
	        tree13.inorderTraversal();
	        System.out.println();
	    }
	}



