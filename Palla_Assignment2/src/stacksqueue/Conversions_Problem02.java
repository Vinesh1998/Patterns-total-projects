package stacksqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Conversions_Problem02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<String>();
		char cha = 'a';
		for(int i = 0; i < 10; i++) {
			stack.add(Character.toString((cha+i)));
		}
		System.out.println("Elements in the  stack: " + stack);
		QueueADT q = stackToqueue(stack);
		System.out.println("Elements in the  Queue from stack conversion: " + q);
		
		String[] array = new String[10];
		for(int i = 10; i < 20; i++) {
			array[i-10] = Character.toString((cha+i));
		}
		System.out.print("Elements in array: ");
		for(String s : array) {
			System.out.print(s + " ");
		}
		LinkedList<String> list = arrayTolinkedlist(array);
		System.out.println("\nElements in LinkedList "
				+ "from array conversion: " + list);
		
		Queue<String> queue = new LinkedList<String>();
		for(int i = 20; i < 30; i++) {
			queue.add(Character.toString((cha+i)));
		}
		System.out.println("Elements in the  Queue: " + queue);
		LinkedList<String> linkedlist = queueTolinkedlist(queue);
		System.out.println("Elements in linked list from queue conversion: " + linkedlist);
		
		LinkedList<String> linked_lists = new LinkedList<String>();
		for(int i = 12; i < 22; i++) {
			linked_lists.add(Character.toString((cha+i)));
		}
		System.out.println("Elements in linked list: " + linked_lists);
		Queue<String> Q0 = linkedlistToqueue(linked_lists);
		System.out.println("Elements in the queue from linkedlist conversion: " + Q0);
		
	}
	
	public static QueueADT stackToqueue(Stack<String> S) {
		QueueADT Q1 = new QueueADT();
		while(!S.isEmpty()) {
			Q1.add(S.remove(0));
		}
		return Q1;
	}
	
	public static LinkedList<String> arrayTolinkedlist(String[] array) {
		LinkedList<String> p = new LinkedList<String>();
		for(int i = 0; i < array.length; i++) {
			p.add(array[i]);
		}
		return p;
	}
	
	public static LinkedList<String> queueTolinkedlist(Queue<String> queue) {
		LinkedList<String> p = new LinkedList<String>();
		p.addAll(queue);
		return p;
	}
	
	public static Queue<String> linkedlistToqueue(LinkedList<String> list) {
		Queue<String> Q = new LinkedList<String>();
		Q.addAll(list);
		return Q;
	}



	}


