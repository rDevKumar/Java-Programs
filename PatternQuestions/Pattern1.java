

import java.util.*;

public class Pattern1 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int i = 0; i < n; i++) {
			for(int j = n; j >= n-i; j--) {
				System.out.print(j+" ");
			}
			for(int j = n; j > i+1; j--) {
				System.out.print(n-i+" ");
			}
			System.out.println();
		}
		
		input.close();
		
	}
}
