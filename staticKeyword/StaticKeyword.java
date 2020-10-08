package staticKeyword;


public class StaticKeyword {
//	static int a = 9;
//	a = 8;
	static {
		
		System.out.println("inside static block");
		
	}
	public static void main(String[] args) {
		System.out.println("Hello, My name is dev kumar");
		staticKeyword.StaticClass.Hi h = new staticKeyword.StaticClass.Hi();
		h.display();
		
	}
}



