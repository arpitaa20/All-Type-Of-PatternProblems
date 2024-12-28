package ap.Pattern;
/*
 * "*
 *  **
 *  ***
 *  **** " TC-->n*n */
public class HalfPyramid {
	public static void main(String[] args) {
//		if rows no = columns no
		int n=4;
//		outer loop for rows iteration
		for(int i=1; i<=n; i++) {
//			inner loop for columns iteration
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
