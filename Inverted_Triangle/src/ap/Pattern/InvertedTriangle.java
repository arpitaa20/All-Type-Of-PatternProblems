package ap.Pattern;

import java.util.Scanner;

/* "*****
 *   ***
 *    * "*/

public class InvertedTriangle {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
//		outer loop--> loop for rows
		for(int i=n; i>=1; i--) {
//			inner loop --> for space
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
//			2nd inner loop --> for star 
			for(int j=1;j<=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
