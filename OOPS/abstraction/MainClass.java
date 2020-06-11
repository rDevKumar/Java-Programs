package oops.abstraction;


public class MainClass {

	public static void main(String[] args) {
		
		WagnoR wagnoR = new WagnoR();
		Audi audi = new Audi();
		repair(wagnoR);
		repair(audi);
		System.out.println(wagnoR.name+""+audi.name);
	}
	public static void repair(Car car) {
		System.out.println("Car is repaired");
	}
	
}
