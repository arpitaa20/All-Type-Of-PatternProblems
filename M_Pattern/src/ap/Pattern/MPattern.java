package ap.Pattern;

import java.util.Scanner;

/* "*     *
 *  **   **
 *  *** ***
 *  ******* "*/
public class MPattern {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n =sc.nextInt();
		
//		outer loop -->for rows
		for(int i=1; i<=n; i++) {
//			inner loop1 --> for * print
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
//			inner loop2 --> for space
			for(int j=1;j<=2*(n-i);j++) {
				System.out.print(" ");
			}
//			inner loop --> for * print
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
