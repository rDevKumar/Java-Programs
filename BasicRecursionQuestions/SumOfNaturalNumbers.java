

import java.util.*;

public class SumOfNaturalNumbers {
	private static int count = 0;

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println(sum(n));
		System.out.println(count);
		input.close();
	}
	
	static int sum(int n) {
		count++;
		if(n == 1) return 1;
		
		return n+sum(n-1);
	}

}
