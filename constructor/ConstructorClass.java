package constructor;

public class ConstructorClass {

	public static void main(String[] args) {
		One one = new One();
		Two two = new Two();
		Three three = new Three(19, "dev");
		System.out.println(one.a);
		System.out.println(two.a);
		System.out.println(three.a+" "+three.name);
		one.display();
		two.display();
		three.display();
	}

}

class One{

	//default constructor
	
	int a;
	void display() {
		System.out.println(a);
	}
	
}

class Two{
	
	//no argument constructor
	public Two(){
		a = 9;
	}
	
	public Two(int a) {
		a = this.a;
		System.out.println("a");
	}
	int a;
	void display() {
		System.out.println(a);
	}
	
}


class Three{
	int a;
	String name;
	
	//parameterized constructor
	public Three(int a, String name){
		this.name = name;
		this.a = a;
	}
	void display() {
		System.out.println(a);
		System.out.println(name);
	}
	
}
