
import java.util.*;

public class BooleanMatrixProblem {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int r = input.nextInt();
		int c = input.nextInt();
		int a[][] = new int[r][c];
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				a[i][j] = input.nextInt();
			}
		}
		long t1 = System.currentTimeMillis();
		System.out.println(t1);
		int b[][] = new int[r][c];
		Arrays.fill(b[r-1], 0);
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				if(a[i][j] == 1) {
					for(int k = 0; k < c; k++) {
						b[i][k] = 1;
					}
					for(int k = 0; k < r; k++) {
						b[k][j] = 1;
					}
				}
			}
		}
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				System.out.print(b[i][j]+" ");
			}System.out.println();
		}
	/*second method given below
*		int row[] = new int[r];
*		int col[] = new int[c];
*		for(int i = 0; i < r; i++) {
*			for(int j = 0; j < c; j++) {
*				if(a[i][j] == 1) {
*					row[i] = 1;
*					col[j] = 1;
*				}
*			}
*		}
*		for(int i = 0; i < r; i++) {
*			for(int j = 0; j < c; j++) {
*				if(row[i] == 1 || col[j] == 1) {
*					a[i][j] = 1;
*				}
*			}
*		}
*		for(int i = 0; i < r; i++) {
*			for(int j = 0; j < c; j++) {
*				System.out.print(a[i][j]+" ");
*			}System.out.println();
*		}
*/
		long t2 = System.currentTimeMillis();
		System.out.println(t2);
		input.close();
	}

}
