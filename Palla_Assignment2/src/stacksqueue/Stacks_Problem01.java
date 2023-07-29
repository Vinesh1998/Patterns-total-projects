package stacksqueue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Stack;

public class Stacks_Problem01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> p1 = new Stack<>();

		p1.add(11);
		p1.add(22);
		p1.add(33);
		p1.add(44);
		p1.add(66);
		p1.add(77);
		p1.add(88);
		p1.add(100);
		p1.add(120);
		
		System.out.println("Displaying the elements in top down fashion");
		for(int i = p1.size()-1; i >= 0; i--) {
			System.out.print(p1.get(i) + " ");
		}
		
		p1.remove(p1.size()-1);
		
		System.out.println("\nDisplaying if the stack is empty or not");
		System.out.println((p1.isEmpty() ? "The Stack is empty" : 
				"The Stack is not empty"));
		
		
		for(int i = 0; i < p1.size()-1; i++) {
			if(p1.get(i) == 22) {
				System.out.println("The position of particular book 22 is " +
							(p1.size() - i));
				break;
			}
		}
		
		
		int stack_size = p1.size();
		ArrayList<Integer> L = new ArrayList<>();
		for(int i = (stack_size/2)-1; i >= 0; i--) {
			L.add(p1.remove(i));
		}
		L.addAll(p1);
		System.out.println("Displaying the elements from the obtained Array List");
		System.out.println(L);
		
		PriorityQueue<Integer> Q = new PriorityQueue<Integer>();
		Q.addAll(L);
		
		System.out.println("Displaying the elements of Q using iterator");
		Iterator<Integer> queue_itr = Q.iterator();
		while(queue_itr.hasNext()) {
			System.out.print(queue_itr.next() + " ");
		}
		
		Deque<Integer> D = new ArrayDeque<Integer>();
		D.addAll(L);
		
		System.out.println("\nDisplaying the elements of D using iterator");
		Iterator<Integer> deque_itr = D.iterator();
		while(deque_itr.hasNext()) {
			System.out.print(deque_itr.next() + " ");
		}
	}



	}


