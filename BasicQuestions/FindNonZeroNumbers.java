

import java.util.*;

public class FindNonZeroNumbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int l = input.nextInt();
		int r = input.nextInt();
		int k = input.nextInt();
		int count = 0;
		for(int i = l+1; i <= r; i++) {
			int rem, temp = 0, num = i, check = 0;
			while(num > 0) {
				rem = num%10;
				num = num/10;
				if(rem != 0) check = rem; 
				if(rem == 0 && check == 0) {
					continue;
				}
				else {
					temp++;
				}
			}
			if(temp == k) {
				count++;
			}
		}
		System.out.println(count);
		input.close();
	}
}
