package ap.Pattern;

import java.util.Scanner;

public class ArpitaPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println();
        
        // Print all letters row by row
        for (int i = 0; i < n; i++) {
        	
            // Print A
            for (int j = 0; j < n * 2 - 1; j++) {
                if (j == n - 1 - i || j == n - 1 + i || (i == n / 2 && j >= n - 1 - i && j <= n - 1 + i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  "); // Space between A and R
            
            // Print R
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 || i == n / 2 || (j == n - 1 && i < n / 2) || (i - j == n / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  "); // Space between R and P
            
            // Print P
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 || i == n / 2 || (j == n - 1 && i < n / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  "); // Space between P and I
            
            // Print I
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == n / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  "); // Space between I and T
            
            // Print T
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == n / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  "); // Space between T and A
            
            // Print A again
            for (int j = 0; j < n * 2 - 1; j++) {
                if (j == n - 1 - i || j == n - 1 + i || (i == n / 2 && j >= n - 1 - i && j <= n - 1 + i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to next line after printing complete row
        }
    }
}