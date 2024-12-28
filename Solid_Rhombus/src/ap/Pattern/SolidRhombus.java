package ap.Pattern;

import java.util.Scanner;

/* "   ****
 *    ****
 *   ****
 *  ****   "*/
public class SolidRhombus {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
//		outer loop --> for rows 
		for(int i=1; i<=n; i++) {
//			inner loop1 --> for space
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
/*			inner loop2 --> for star 
			(n bcz in every row print same number of * which is = to n)*/
			for(int j=1; j<=n; j++) {
				System.out.print("*");
			} 
		   System.out.println();
		}
	}

}
