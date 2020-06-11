package interviewQuestions;

import java.util.*;

//import queues.MyDeque;

public class SlidingWindowMaximum {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = input.nextInt();
		}
		int k = input.nextInt();
		Solution sl = new Solution();
		int res[] = sl.slidingWindowMaximum(a, k, n);
		for(int x : res) {
			System.out.print(x+" ");
		}
		input.close();
	}
}

class Solution{
	
	public int[] slidingWindowMaximum(int a[], int k, int n) {
//		MyDeque<Integer> dq = new MyDeque<>();
		Deque<Integer> dq = new LinkedList<>();
		int i = 0;
		for(; i < k; i++) {
			while(!dq.isEmpty() && a[dq.peekLast()] <= a[i]) {
				dq.removeLast();
			}
			dq.addLast(i);
		}
		int ans[] = new int[n-k+1];
		for(; i < n; i++) {
			ans[i-k] = a[dq.peekFirst()];
			while(!dq.isEmpty() && dq.peekFirst() <= i-k) {
				dq.removeFirst();
			}
			while(!dq.isEmpty() && a[dq.peekLast()] <= a[i]) {
				dq.removeLast();
			}
			dq.addLast(i);
		}
		ans[i-k] = a[dq.peekFirst()];
		return ans;
	}
	
}
