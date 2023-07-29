package linkedlist;

public class LinkedListDemo {

		public static void main(String[] args) {
			
			Node head = new Node(36);
			System.out.println("Address of head: " + head);
			System.out.println("Data of head: " + head.data);
			System.out.println("Next of head: " + head.next);
			System.out.println("Prev of head: " + head.prev);
			
			Node secondNode = new Node(78);
			System.out.println("Address of SecondNode: " + secondNode);
			System.out.println("Data of secondNode: " + secondNode.data);
			System.out.println("Next of secondNode: " + secondNode.next);
			System.out.println("Prev of secondNode: " + secondNode.prev);
			
			Node thirdNode = new Node(99);
			System.out.println("Address of thirdNode: " + thirdNode);
			System.out.println("Data of thirdNode: " + thirdNode.data);
			System.out.println("Next of thirdNode: " + thirdNode.next);
			System.out.println("Prev of thirdNode: " + thirdNode.prev);
			
			head.next = secondNode;
			secondNode.prev = head;
			secondNode.next = thirdNode;
			thirdNode.prev = secondNode;
			
			Node p = head;
			int sum = 0;
			int count = 0;
			while(p != null) {
				System.out.println("Inside loop: " + p.data);
				sum = sum + p.data;
				count = count + 1;
				p = p.next;
			}
			System.out.println("Count: " + count);
			System.out.println("Sum: " + sum);
			
			Node newhead = new Node(22);
			System.out.println("Address of newhead: " + newhead);
			System.out.println("Data of newhead: " + newhead.data);
			System.out.println("Next of newhead: " + newhead.next);
			System.out.println("Prev of newhead: " + newhead.prev);
			
			Node updatedhead = linkbothlists(head,newhead);
			Node r = updatedhead;
			while(r != null) {
				System.out.println("Inside loop with updated head: " + r.data);
				r = r.next;
			}
			
			// Print the elements of list in backward direction
			System.out.println("\nPrinting elements of list in backward direction: ");
			Node no1 = updatedhead;
			while(no1.next != null) {
				no1 = no1.next;
			}
			while(no1 != null) {
				System.out.print(no1.data + " ");
				no1 = no1.prev;
			}
			
			// Calling method addLastNode()
			System.out.print("\n\nOriginal list: ");
			no1 = updatedhead;
			while(no1.next != null) {
				System.out.print(no1.data + " -> ");
				no1 = no1.next;
			}
			System.out.print(no1.data);
			
			System.out.print("\nUpdated list: ");
			Node newLi = addLastNode(updatedhead, 43);
			no1 = newLi;
			while(no1.next != null) {
				System.out.print(no1.data + " -> ");
				no1 = no1.next;
			}
			System.out.print(no1.data);
			
			
			// Calling method addNode()
			System.out.print("\n\nOriginal list: ");
			no1 = newLi;
			while(no1.next != null) {
				System.out.print(no1.data + " -> ");
				no1 = no1.next;
			}
			System.out.print(no1.data);
			
			System.out.print("\nUpdated list: ");
			Node newLi2 = addNode(newLi, 88);
			no1 = newLi2;
			while(no1.next != null) {
				System.out.print(no1.data + " -> ");
				no1 = no1.next;
			}
			System.out.print(no1.data);
		}

		public static Node linkbothlists(Node h, Node nh) {
			nh.next = h;
			h.prev = nh;
			return nh;
		}
		
		// Method that adds node at the end of the list
		public static Node addLastNode(Node h, int num) {
			Node newN = new Node(num);
			Node no1 = h;
			while(no1.next != null) {
				no1 = no1.next;
			}
			no1.next = newN;
			newN.prev = no1;
			return h;
		}
		
		// Method that adds node after the head node
		public static Node addNode(Node h, int num) {
			Node newN = new Node(num);
			newN.next = h.next;
			h.next.prev = newN;
			h.next = newN;
			newN.prev = h;
			return h;
		}
	


	}


