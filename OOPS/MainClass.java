package oops;

import java.util.*;

public class MainClass {
	
	public static void main(String[] args) {
     
		Scanner in = new Scanner(System.in);
		
			int a[] = {5, -1, 8, 9, 0};
			int k = 12;
			System.out.println(getData(a, k));
		in.close();

	}
	
	public static boolean getData(int a[], int k){
		Arrays.sort(a);
	    for(int i =  0; i < a.length-1; i++) {
	    	if(giveData(a, k, i)) return true;
	    }
	    return false;
	}

	public static boolean giveData(int a[], int x, int i) {
		int j = a.length-1;
		while (i < j) {
			if(a[i]+a[j] > x) {
				j--;
			}
			else if(a[i]+a[j] < x) {
				i++;
			}
			else return true;
		}
		return false;
	}

}
