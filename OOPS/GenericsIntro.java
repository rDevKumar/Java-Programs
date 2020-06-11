/*Generics Intro*/

public class Pairs<X, Y, Z> {
	
	X x;
	Y y;
	
	public Pairs(X x, Y y) {
		this.x = x;
		this.y = y;
	}
	
	public void getDescription() {
		System.out.println(x + " and " + y);
	}

}
