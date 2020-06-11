package oops;

public class Access {

	private int age=12;
	int getAge() {
		return age;
	}
    public void setAge(int age) {
    	if(age  > 20) {
    		System.out.println("You are too old to be student");
    	}
    	else {
    		this.age = age;
    	}
    }
}
