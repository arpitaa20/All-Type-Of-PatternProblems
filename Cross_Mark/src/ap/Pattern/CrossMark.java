package ap.Pattern;

import java.util.Scanner;

/*"*   *
 *   *
 *  * *
 * *   * "
 */
 
public class CrossMark {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		
//		outer loop--> for rows
		for(int i=1; i<=n; i++) {
//			inner loop --> for columns
			for(int j=1; j<=n; j++) {
//				for star print --> j==i((1,1),(2,2)... OR (1,5),(2,4),(4,2)..)
				if(i==j || i+j==n+1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
