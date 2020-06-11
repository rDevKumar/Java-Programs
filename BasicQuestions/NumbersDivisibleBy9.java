

import java.util.*;

public class NumbersDivisibleBy9 {
	private static int count = 0;
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
//		int count = 0;
//		for(int i = n+1; i < m; i++) {        (using for loop)
//			if(i%9 == 0) {
//				count++;
//				continue;
//			}
//		}
//		System.out.println(count);
		System.out.println(countNumbers(n+1, m, 9));
		input.close();
	}
	static int countNumbers(int i, int m, int k) {  //   (using recursion)
		if(i < m) {
			if(i % k == 0) {
				count++;
			}
			countNumbers(i+1, m, k);
		}
		
		return count;
	}

}
