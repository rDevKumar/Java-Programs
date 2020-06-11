

public class MyLinkedList<E> {
	Node<E> head;
	
	/*peek method*/
	
	E peek() {
		if(isEmpty()) {
			return null;
		}
		else if(head.next == null) {
			return head.data;
		}
		Node<E> temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		return temp.data;
	}
	
	/*remove method with help of data*/

	public E remove(E data) {
		if(head == null) {
			checkLinkedList();
			return null;
		}
		else if(head.next == null && head.data == data) {
			Node<E> temp = head;
			head = null;
			return temp.data;
		}
		Node<E> temp = head;
		Node<E> prev = temp;
		while(temp != null) {
			if(temp.data == data) {
				prev.next = prev.next.next;
				return temp.data;
			}
			prev = temp;
			temp = temp.next;
		}
		return null;
	}
	
	/*check empty linkedlist*/
	
	public void checkLinkedList() {
		if(isEmpty()) {
			System.out.println("No element in the list.");
		}
	}
	
	/*remove method with the help of indeces*/
	
	public E remove(int i) {
		if(head == null) {
			checkLinkedList();
			return null;
		}
		else if(i == 0 && head.next != null) {
			Node<E> temp = head.next;
			head = null;
			head = temp;
		}
		else if(head.next == null && i == 0) {
			head = null;
			return head.data;
		}
		Node<E> temp = head;
		Node<E> prev = temp;
		int j = 0;
		while(temp != null) {
			if(i == j) {
				prev.next = prev.next.next;
				return temp.data;
			}
			prev = temp;
			temp = temp.next;
			j++;
		}
		return null;
	}
	
	/*contains method*/
	
	public boolean contains(E data){
		if(head == null) {
			checkLinkedList();
			return false;
		}
		Node<E> temp = head;
		while(temp != null) {
			if(temp.data == data) {
				return true;
			}
			temp = temp.next;
		}
		return false;
 	}
	
	/*removeall method*/
	
	public void removeAll() {
		head.next = null;
		head = null;
	}
	
	/*remove method*/
	
	public E remove() {
		
		if(isEmpty()) {
			head = null;
			return null;
		}
		else if(head.next == null) {
			E temp = head.data;
			head = null;
			return temp;
		}
		Node<E> temp = head;
		while(temp.next.next != null) {
			temp = temp.next;
		}
		E returnValue = temp.next.data; 
		temp.next = null;
		return returnValue;
	}
	
	/*add method*/
	
	public void add(E data) {
		
		Node<E> toAdd = new Node<>(data);
		if(isEmpty()) {
			head = toAdd;
			return;
		}
		Node<E> temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = toAdd;
	}
	
	/*print method*/
	
	public void print() {
		
		if(isEmpty()) {
			System.out.println("null");
			return;
		}
		Node<E> temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	/*isEmpty method*/
	
	public boolean isEmpty() {
		
		return (head == null) ? true : false;
		
	}
	
	/*Node class declared static*/
	
	static class Node<E> {
		
		E data;
		Node<E> next;
		public Node(E data){
			this.data = data;
			next = null;
		}
	}
}
