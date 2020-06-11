

public class MyLinkedList {

	public static void main(String[] args) {
		
		MyLinkedClass myll = new MyLinkedClass();
		myll.add(6);
		myll.add(56);
		myll.add(123);
		myll.add(78);
		myll.add(18);
	//	myll.add(2, 5);
		System.out.println(myll.contains(56));
		myll.print();
			
	}

}
