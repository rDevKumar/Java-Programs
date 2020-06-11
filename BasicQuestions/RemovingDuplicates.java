

import java.util.*;

public class RemovingDuplicates {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = input.nextInt();
		}
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n;) {
				if(a[i] == a[j]) {
					for(int k = j; k < n-1; k++) {
						a[k] = a[k+1];
					}
					n--;
				}
				else {
					j++;
				}
			}
		}
		for(int i = 0; i < n; i++) {
			System.out.print(a[i]+" ");
		}
		input.close();
	}

}


	

