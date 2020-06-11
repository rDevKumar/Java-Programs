

public class PracticeStack {

	public static void main(String[] args) throws Exception{

		MyStack<Integer> stack = new MyStack<>();
		
		stack.push(10);
		stack.push(56);
		stack.push(11);
		stack.print();
		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
		System.out.println(stack.peek());
		stack.print();

	}

}
