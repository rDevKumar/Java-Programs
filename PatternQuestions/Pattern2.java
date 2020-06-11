

import java.util.*;

public class Pattern2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int k = 0;
		for(int i = 0; i < n; i++) {
			for(int j = n-i-1; j > 0; j--) {
				System.out.print(" ");
			}
			for(int j = i; j < i+i+1; j++) {
				System.out.print(j+1);
				k = j+1;
			}
			for(int j = k; j > 2+i-1; j--) {
				System.out.print(j-1);
			}
			System.out.println();
		}
		input.close();
	}
}

