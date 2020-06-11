

import java.util.*;

public class StringSubsequences {
	
	private static List<String> sub = new ArrayList<>();

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		subsequences(str, "");
		System.out.println(sub);
		input.close();
	}
	
	static void subsequences(String str, String res) {
		if(str.length() == 0) {
			sub.add(res);
			return;
		}
			subsequences(str.substring(1), res+str.charAt(0));
			subsequences(str.substring(1), res);
		
	}
	}
