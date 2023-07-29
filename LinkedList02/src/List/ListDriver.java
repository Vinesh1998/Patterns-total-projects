package List;

public class ListDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node head = new Node(36);
		System.out.println("Address of head: "+head);
		System.out.println("Data of head: "+head.data);
		System.out.println("Next of head: "+head.next);
		
		Node secondNode = new Node(78);
		System.out.println("Address of SecondNode: "+secondNode);
		System.out.println("Data of secondNode: "+secondNode.data);
		System.out.println("Next of secondNode: "+secondNode.next);
		
		Node thirdNode = new Node(99);
		System.out.println("Address of thirdNode: "+thirdNode);
		System.out.println("Data of thirdNode: "+thirdNode.data);
		System.out.println("Next of thirdNode: "+thirdNode.next);
		
		head.next = secondNode;
		secondNode.next = thirdNode;
		
		Node p = head;
		int sum = 0;
		int count = 0;
		
		while(p!=null) {
			System.out.println("Inside loop: "+p.data);
			sum = sum+p.data;
			count = count+1;
			p = p.next;		
		}
		System.out.println("Count: "+count);
		System.out.println("Sum: "+sum);
		
		Node newhead = new Node(22);
		System.out.println("Address of newhead: "+newhead);
		System.out.println("Data of newhead: "+newhead.data);
		System.out.println("Next of newhead: "+newhead.next);
		Node updatedhead = linkbothlists(head,newhead);
		
		Node r = updatedhead;
		
		while(r!=null) {
			System.out.println("Inside loop with updated head: "+r.data);
			r = r.next;		
		}
		

	}
	public static Node linkbothlists(Node h, Node nh) {
		nh.next = h;
		return nh;
		
	}

}
