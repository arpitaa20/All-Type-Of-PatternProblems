package ap.Pattern;
import java.util.Scanner;

/*
 * " *
 *  * *
 * * * * "*/
public class EquilateralTriangle {
    public static void main(String[] args) {
//    	for input whatever you want n=1,2,3.....n
    	Scanner sc= new Scanner(System.in);
    	int n=sc.nextInt();
    	
//    	outer loop -->print rows
    	for(int i=1; i<=n; i++) {
//    		1st inner loop --> print space
    		for(int j=1; j<=n-i; j++) {
    			System.out.print(" ");	
    		}
//    		2nd  loop --> print * and give some space which maintain the space b/w 2 *.
    		for(int j=1; j<=i; j++) {
    			System.out.print("* ");
    		}
    		System.out.println();
    	}
	
    }
}
