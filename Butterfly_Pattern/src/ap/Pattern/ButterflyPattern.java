package ap.Pattern;
import java.util.Scanner;
/*"*      *
 * **    **
 * ***  ***
 * ********
 * ********
 * ***  ***
 * **    **
 * *      * "*/
public class ButterflyPattern {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n =sc.nextInt();	
   /* 1st create M_pattern & then inverted it */
		
//		outer loop --> for rows 
		for(int i=1; i<=n; i++) {
//			inner loop1 --> for * print
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
//			inner loop2 --> for space
			for(int j=1; j<=2*(n-i); j++) {
				System.out.print(" ");
			}
//			inner loop3 --> for *
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
//		Now inverted this flow from bottom to top
//		outer loop --> for rows
		for(int i=n; i>=1; i--) {
//			inner loop1 --> for * print
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
//			inner loop2 --> for space
			for(int j=1; j<=2*(n-i); j++) {
				System.out.print(" ");
			}
//			inner loop3 --> for *
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}	
}
