package practice;

import java.util.Scanner;

class Input {
	int rows, cols;
	void input() {
		Scanner obj = new Scanner(System.in);
	
		rows = obj.nextInt();
		cols = obj.nextInt();
		int a[][] = new int[rows][cols];
		int b[][] = new int[rows][cols];
		int c[][] = new int[rows][cols];
		int d[][] = new int[rows][cols];
		
	for(int i = 0; i < rows; i++) {
		for(int j = 0; j < cols; j++) {
			a[i][j] = obj.nextInt();
		}
	}
	
	for(int i = 0; i < rows; i++) {
		for(int j = 0; j < cols; j++) {
			b[i][j] = obj.nextInt();
		}
	}
	
	
	for(int i = 0; i < rows; i++) {
		
		for(int j = 0; j < cols; j++) {
			c[i][j] = 0;
			for(int k = 0; k < cols; k++) {
			
			c[i][j] = c[i][j] + a[i][k] * b[k][j];
		}
			d[i][j] = c[i][j];
			}
	}
	
for(int i = 0; i < rows; i++) {
		
		System.out.println();
		for(int j = 0; j < cols; j++) {
			
			System.out.print(d[i][j]+" ");
		}
	}
	
obj.close();
	}
	
}



public class Array {

	public static void main(String[] args) {
		
		Input g = new Input();
		g.input();
	}

}
