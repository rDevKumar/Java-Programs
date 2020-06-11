

import java.util.*;

public class PowerOfNumber {
	
	private static int count = 0;
	private static int count0 = 0;
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		System.out.println(pow(a, b));
		System.out.println(count0);
		System.out.println(fastPow(a, b));
		System.out.println(count);
		input.close();
	}
	static int fastPow(int a, int b) {
		++count;
		if(b == 0) return 1;
		if(b%2 == 0) return pow(a*a, b/2);
		return a*pow(a*a, (b-1)/2);
	}
	static int pow(int a, int b) {
		++count0;
		if(b == 0) return 1;
		return a*pow(a, b-1);
	}

}
