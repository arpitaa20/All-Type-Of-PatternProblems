package ap.Pattern;
/*
 * " ****
 *   ***
 *   **
 *   * " TC-->n*n */
public class InvertedHalfPyaramid {
	public static void main(String[] args) {
		int n=5;
//		rows iteration --> use outer loop
		for(int i=n; i>=1; i--) {
//			columns print --> use inner loop
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
