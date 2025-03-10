package ap.Pattern;

import java.util.Scanner;

public class HollowDiamond {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
//		outer loop --> for rows
		for(int i=1; i<=n; i++) {
//			inner loop1 --> for space
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
//			inner loop2--> for *
			for(int j=1; j<=2*i-1; j++) {
				if(j==1 || j==2*i-1) {
					System.out.print("* ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
//		Now inverted it
		
//		outer loop --> for rows
		for(int i=n-1; i>=1; i--) {
//			inner loop1 --> for space
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
//			inner loop2 --> for *
			for(int j=1; j<=2*i-1; j++) {
				if(j==1 || j==2*i-1) {
				System.out.print("* ");
			   }else {
				System.out.print(" ");
			   }
			}
		System.out.println();
		}
	}
}
