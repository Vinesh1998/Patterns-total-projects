package stacksqueue;

import java.util.*;

public class QueueADT {
	
	ArrayList<String> queue;
	int rear;
	int front;
	
	public QueueADT() {
		this.queue = new ArrayList<>();
		this.rear = -1;
		this.front = -1;
	}
	
	public void add(String data) {
		if(front == -1) {
			++front;
			++rear;
			queue.add(data);
		} else {
			++rear;
			queue.add(data);
		}
	}
	
	public String remove() {
		front++;
		return queue.remove(front);
	}
	
	@Override
	public String toString() {
		return queue.toString();
	}
}
