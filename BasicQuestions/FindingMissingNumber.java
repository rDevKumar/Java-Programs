
import java.util.*;
public class FindingMissingNumber {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int a[] = new int[n];
		boolean find = false;
		int missing = 1;
		for(int i = 0; i < n-1; i++) {
			a[i] = input.nextInt();        
		}
		for(int i = 1; i <= n; i++) {
			find = false;
			for(int j = 0; j < n-1; j++) {
				if(i == a[j]) {
					find = true;
					break;
				}
			}
			if(!find) {
				missing = i;
				break;
			}
		}
		System.out.println(missing);
		input.close();
	}

}
