package linkedlist;

import java.util.LinkedList;

public class ArrayOfLinkedList {

	
		public static void main(String args[]) {
			
			// Create array of LinkedList of size 5
			LinkedList[] arrayLinkedList = new LinkedList[5];
			
			// Initialize arrayLinkedList to an empty list
			for(int f = 0; f < 5; f++) {
				arrayLinkedList[f] = new LinkedList();
			}
			
			// Insert the names into arrayLinkedList
			arrayLinkedList[0].add("Sajida");
			arrayLinkedList[0].add("Nikhila");
			arrayLinkedList[0].add("Mahesh");
			
			arrayLinkedList[1].add("Anu");
			arrayLinkedList[1].add("Divya");
			arrayLinkedList[1].add("Pavan");
			
			arrayLinkedList[2].add("Shiva");
			arrayLinkedList[2].add("Charan");
			arrayLinkedList[2].add("Surya");
			
			arrayLinkedList[3].add("Naveen");
			arrayLinkedList[3].add("Vikram");
			arrayLinkedList[3].add("Arjun");
			
			arrayLinkedList[4].add("Pooja");
			arrayLinkedList[4].add("Harsha");
			arrayLinkedList[4].add("Navya");
			
			// Print the array
			for(LinkedList<String> st : arrayLinkedList) {
				System.out.println(st);
			}
		}
	


	}

