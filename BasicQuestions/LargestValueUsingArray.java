

import java.util.*;

public class LargestValueUsingArray {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String s = input.nextLine().trim();
		
		char ch[] = s.toCharArray();
		List<Character> al = new ArrayList<>();
		for(char c: ch) {
			if(c !=',' && c != ' ') {
				
				al.add(c);
			}
		}
	Collections.sort(al, Collections.reverseOrder());
		for(char c : al) {
			System.out.print(c);
		}
		input.close();
	}

}
