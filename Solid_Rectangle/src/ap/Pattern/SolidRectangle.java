package ap.Pattern;

/*
 * "*****
 *  *****
 *  *****
 *  *****" 
 * ---> TC - O(r*c)
 * */

public class SolidRectangle {
	public static void main(String[] args) {
//		for columns-->inner loop & for rows -->outer loop
		int c = 5;
		int r = 4;
		
//		1st Iterate all rows 
		for(int i=1; i<=r; i++) {
//			2nd Iterate all columns
			for(int j=1; j<=c; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	

}
