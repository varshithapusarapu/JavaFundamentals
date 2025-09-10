package com.codegnan.patterns;
import java.util.Scanner;
public class hurGlassouter {
	

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of rows: ");
	        int n = sc.nextInt();

	        int totalCols = 2 * n - 1;

	        // Upper inverted hollow pyramid
	        for (int i = n; i >= 1; i--) {
	            // spaces
	            for (int j = n; j > i; j--) {
	                System.out.print(" ");
	            }
	            // stars and spaces
	            for (int j = 1; j <= 2 * i - 1; j++) {
	                if (j == 1 || j == 2 * i - 1 || i == n) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }

	        // Lower hollow pyramid
	        for (int i = 2; i <= n; i++) {
	            // spaces
	            for (int j = n; j > i; j--) {
	                System.out.print(" ");
	            }
	            // stars and spaces
	            for (int j = 1; j <= 2 * i - 1; j++) {
	                if (j == 1 || j == 2 * i - 1 || i == n) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	        sc.close();
	    }
	}
