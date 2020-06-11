

public class MyStack<E> {

		MyLinkedList<E> ll = new MyLinkedList<>();
		
		void push(E e) {
			ll.add(e);
		}
		
		E pop() throws Exception{
			if(ll.isEmpty()) {
				throw new Exception ("removing form a empty linkedlist is not allowed.");
			}
			return ll.remove();
		}
		
		E peek() throws Exception{
			if(ll.isEmpty()) {
				throw new Exception ("peeking form a empty linkedlist is not allowed.");
			}
			return ll.peek();
		}
		
		void print() {
			ll.print();
		}
		

}
