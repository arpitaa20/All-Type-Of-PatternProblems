package ap.Pattern;

import java.util.Scanner;

/*"  *
 *  * *
 * * * *
 * * * *
 *  * *
 *   *    "*/
public class DiamondPattern {
	public static void main(String[] args) {
		/* 1st print triangle then inverted it*/
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
//		outer loop --> for rows
		for(int i=1; i<=n; i++) {
//			inner loop1 --> for space
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
//			inner loop2 --> for *
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
//		Now inverted it
		
//		outer loop --> for rows
		for(int i=n; i>=1; i--) {
//			inner loop1 --> for space
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
//			inner loop2 --> for * print
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}		
	}
}
