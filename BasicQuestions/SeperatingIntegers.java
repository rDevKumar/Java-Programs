

import java.util.*;

public class SeperatingIntegers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		List<Integer> nal = new ArrayList<>();
		List<Integer> pal = new ArrayList<>();
		for(int i = 0; i < 9; i++) {
			int a = input.nextInt();
			if(a < 0) {
				nal.add(a);
			}
			else pal.add(a);
		}
		int j = 0, k = 0;
		for(int i = 0; i < 9; i++) {
			if(i < nal.size()) {
				System.out.print(nal.get(j)+" ");
				j++;
			}
			else {
				System.out.print(pal.get(k)+" "); 
				k++;
			}
		}
		input.close();
	}

}
