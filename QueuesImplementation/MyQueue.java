

public class MyQueue<E> {
	

	private Node<E> front, rear;
	
	static class Node<E>{
		E data;
		Node<E> next;
		Node(E data){
			this.data = data;
			this.next = null;
		}
	}
	
		void enqueue(E data) {
			Node<E> toAdd = new Node<>(data);
			if(front == null) {
				front = rear = toAdd;
				return;
			}
			rear.next = toAdd;
			rear = rear.next;
		}
		
		E dequeue() {
			if(front == null) {
				return null;
			}
			else if(front.next == null) {
				Node<E> toRemove = front;
				front = rear = null;
				return toRemove.data;
			}
			Node<E> toRemove = front;
			front = front.next;
			return toRemove.data;
		}
		
		E peek() {
			if(front == null) {
				return null;
			}
			return front.data;
		}
		boolean contains(E data) {
			if(front == null) {
				return false;
			}
			Node<E> temp = front;
			while(temp != null) {
				if(temp.data == data) {
					return true;
				}
				temp = temp.next;
			}
			return false;
		}
}
