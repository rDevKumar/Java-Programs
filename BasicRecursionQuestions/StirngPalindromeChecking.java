

import java.util.*;

public class StirngPalindromeChecking {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		int n = str.length();
		System.out.println(isPalindrome(str, 0, n));
		input.close();
	}
	static boolean isPalindrome(String str, int i, int n) {
		if(n == 1) return true;
		
		if(str.charAt(i) != str.charAt(n-1)) return false;
		
		if(i < n) {
			return isPalindrome(str, i+1, n-1);
		}
		return true;
												
	}

}
