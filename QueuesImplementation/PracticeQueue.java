

public class PracticeQueue {

	public static void main(String[] args) {

		MyQueue<Integer> mq = new MyQueue<>();
		mq.enqueue(5);
		mq.enqueue(96);
		mq.enqueue(52);
		mq.enqueue(31);
		mq.enqueue(42);
		System.out.println(mq.dequeue());
		System.out.println(mq.peek());
		System.out.println(mq.contains(96));
		System.out.println(mq.dequeue());
		System.out.println(mq.peek());
		System.out.println(mq.dequeue());
		System.out.println(mq.peek());
		System.out.println(mq.dequeue());
		System.out.println(mq.peek());
		System.out.println(mq.contains(96));
		System.out.println(mq.contains(42));
		System.out.println(mq.dequeue());
		System.out.println(mq.peek());
		System.out.println(mq.dequeue());
	}

}
