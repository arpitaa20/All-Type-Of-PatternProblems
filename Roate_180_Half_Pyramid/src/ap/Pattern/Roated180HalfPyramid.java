package ap.Pattern;
/*
 * "    *
 *     **
 *    ***
 *   **** */
public class Roated180HalfPyramid {
	public static void main(String[] args) {
//		when rows & columns no. are same
		int n=4;
//		outer loop --> for rows iteration
		for(int i=1; i<=n; i++) {
//			inner loop1 --> for space print
			for(int j=1; j<= n-i; j++) {
				System.out.print(" ");
			}
//			inner loop2 --> for star print
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
