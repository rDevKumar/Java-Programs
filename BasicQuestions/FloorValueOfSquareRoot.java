

import java.util.*;

public class FloorValueOfSquareRoot {
	private static int root = 0;
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
//		int root = 0;
//		for(int i = 1; i <= n/2+1; i++) {       //using loop
//			if(i*i == n) {
//				root = i;
//				break;
//			}
//			else if(i*i > n) {
//				root = i-1;
//				break;
//			}
//		}
//		System.out.println(root);
		System.out.println(sqrtRoot(1, n));
		input.close();
	}
	static int sqrtRoot(int i, int n) {          //using recursion :)
		if(i <= n/2+1) {
			if(i*i == n) {
				root = i;
				return root;
			}
			else if(i*i > n) {
				root = i-1;
				return root;
				}
			sqrtRoot(i+1, n);
		}
		return root;
	}
}
