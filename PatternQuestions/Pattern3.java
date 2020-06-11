

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  int n = input.nextInt();
	  
		  for(int i = 1; i <= n; i++) {
			  for(int k = 0; k < n - i; k++)
				 {
				 System.out.print(" ");
				 }
			 for(int j = 1; j <= i; j++) {
				  System.out.print("* ");
			  }
			  System.out.println();
		  }
		  
		  for(int i = 1; i <= n - 1; i++) {
			  for(int k = 0; k < i; k++)
				 {
				 System.out.print(" ");
				 }
			 for(int j = 1; j <= n - i; j++) {
				  System.out.print("* ");
			  }
			  System.out.println();
		  }
		   input.close();
	}
}
