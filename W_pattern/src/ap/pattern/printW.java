package ap.pattern;

public class printW {
	    public static void printW(int n) {
	        System.out.println("Print W:");
	        for (int i = n - 1; i >= 0; i--) {  // Changed loop to start from bottom
	            for (int j = 0; j < n * 2; j++) {
	                if (j == 0 || j == n * 2 - 1 || 
	                    (j == i && i >= n / 2) || 
	                    (j == n * 2 - i - 1 && i >= n/2)) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	    }

	    public static void main(String[] args) {
	        // Example usage with different sizes
	        System.out.println("W with size 5:");
	        printW(5);
	        
	        
	    }
	}

