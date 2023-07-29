package practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Practice_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> myStack = new Stack<String>();
		myStack.push("java");
		myStack.push("is a ");
		myStack.push("programming");
		myStack.push("lang");
		//myStack.peek();
		//myStack.peek();
		//myStack.remove("patterns");
		System.out.print(myStack.search("programming"));
	}
}


