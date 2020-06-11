
import java.util.*;

public class FindTopKthGreatesNumbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		while(t-- > 0) {
			int n = input.nextInt();
			int k = input.nextInt();
			int a[] = new int[n];
			for(int i = 0; i < n; i++) {
				a[i] = input.nextInt();
			}
			PriorityQueue<Integer> pq = new PriorityQueue<>();
			for(int i = 0; i < n; i++) {
				if(i < k) {
					pq.add(a[i]);
				}
				else {
					if(pq.peek() < a[i]) {
						pq.remove();
						pq.add(a[i]);
					}
				}
			}
			ArrayList<Integer> result = new ArrayList<>(pq);
			Collections.sort(result, Collections.reverseOrder());
			for(int x : result)
				System.out.print(x+" ");
	}
input.close();
}
}