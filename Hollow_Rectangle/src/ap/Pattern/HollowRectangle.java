package ap.Pattern;
/*
 * "*****
 *  *   *
 *  *   *
 *  *****"
 *  ----> TC - O(r*c)
 *  */ 
public class HollowRectangle {
	public static void main(String[] args) {
		int c=5;
		int r=4;
		
//		Iterate rows
		for(int i=1; i<=r; i++) {
//			iterate each index of columns
			for (int j=1; j<=c; j++) {
//				cell print --> "*"
				if(i==1 || j==1 || i==r || j==c) {
					System.out.print("*");
				}else {
//					for hollow space --> " "
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
