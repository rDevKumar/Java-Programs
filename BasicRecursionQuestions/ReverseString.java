

import java.util.*;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		System.out.println("String before reverse \n"+str);
		int n = str.length();
		String revStr = "";
		System.out.println("String after reverse \n"+(reverseString(str, revStr, n)));
		input.close();
	}
	static String reverseString(String str, String revStr, int n) {
		revStr = revStr + str.charAt(n-1);
		if(n == 1) return revStr;
		if(n >= 0) {
			return reverseString(str, revStr, n-1); 
		}
		return revStr;
	}

}
