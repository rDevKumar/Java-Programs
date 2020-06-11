

public class MyLinkedClass<E> {
	
	Node<E> head;
	
	void add(E data) {
		Node<E> toAdd = new Node<>(data);
		if(isEmpty()) {
			head  = toAdd;
			return;
		}
		Node<E> temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = toAdd;
	}
	
	boolean contains(E data) {
		Node<E> toCheck = new Node<>(data);
		Node<E> temp = head;
		boolean is = false;
		while(temp != null) {
			if(temp.equals(toCheck)) {
				is = true;
				break;
			}
			temp = temp.next;
		}
		if (is) {
			return true;
		}
		else{
			return false;
		}
	}
	
	void add(int i, E data) {
		Node<E> toAdd = new Node<>(data);
		if(isEmpty()) {
			head  = toAdd;
			return;
		}
		Node<E> temp = head;
		int j = 0;
		while(j < i - 1) {
			temp = temp.next;
			j++;
		}
		Node<E> add = temp.next;
		temp.next = null;
		temp.next = toAdd;
		toAdd.next = add;
	}
	
	
	void removeAll() {
		head = null;
	}
	
	void remove(int i) {
		Node<E> temp = head;
		try {
		if(isEmpty()) {
			System.out.print("No element in the linked list.");
		}
		Node<E> removePrev = temp;
		for(int j = 0; j < i; j++) {
			removePrev = temp;
			temp = temp.next;
		}
		temp = temp.next;
		removePrev.next = null;
		removePrev.next = temp;
		}catch(Exception e) {
			System.out.println(e.getMessage()+", element not found on this index please enter correct index number.");
		}
	}
	
	void print() {
		Node<E> temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
	boolean isEmpty() {
		return head == null;
	}
	
	static class Node<E>{
		E data;
		Node<E> next;
		public Node(E data) {
			this.data = data;
			next = null;
		}
	}
}
