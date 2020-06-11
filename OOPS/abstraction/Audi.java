package oops.abstraction;

public class Audi extends WagnoR {
String name = " kumar";
	
	public void breaking() {
		System.out.println("Audi is breaking");
	}

	@Override
	public void acceleration() {
		System.out.println("Audi is accelerating");	
	}
}
