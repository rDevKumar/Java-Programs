

import java.util.*;

public class PathInMatrix {

	private static int count = 0;
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int m = input.nextInt();
		int n = input.nextInt();
		System.out.println(path(m, n));
		System.out.println(count);
		input.close();
	}
	static int path(int m, int n) {
		count++;
		if(m == 1 || n ==1) return 1;
		
		return path(m, n-1) + path(n, m-1);
	}

}
