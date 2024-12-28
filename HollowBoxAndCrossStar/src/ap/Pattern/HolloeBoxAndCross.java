package ap.Pattern;

import java.util.Scanner;

/* "******
 *  **  **
 *  * ** *
 *  *  * *
 *  * ** *
 *  **  **
 *  ******   "*/
public class HolloeBoxAndCross {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
//		outer loop --> for rows
		for(int i=1; i<=n; i++) {
//			inner loop --> for columns
			for(int j=1; j<=n; j++) {
/*			print start (hollow * --> if i==1 or j==1 or i==n or j==n)
			&(for cross * --> if i+j ==n+1 or i==j)*/
				if(i==1 || j==1 || i==n || j==n || i+j == n+1 || i==j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
		}
			System.out.println();
		}
	}
}

