package mypack.queue;

public class Queue<T> {
	
	private Node<T> front;
	private Node<T> rear;
	
	private int length;
	
	private static class Node<T> {
		private final T data;
		private Node<T> next;
 
		public Node(T data) {
			this.data = data;
		}
	}
	
	public void enQueue(T item) {
		if (front == null) {
			rear = new Node<T>(item);
			front = rear;
		} else {
			rear.next = new Node<T>(item);
			rear = rear.next;
		}
		length++;
	}
	
	public T deQueue() {
		if (front != null) {
			T item = front.data;
			front = front.next;
			length--;
			return item;
		}
		return null;
	}
	
	public int size() {
		return length;
	}
	
	public void displayQueue() {
		Node<T> currentNode = front;
		while (currentNode != null) {
			System.out.print(currentNode.data+" ");
			currentNode = currentNode.next;
		}
	}

}
