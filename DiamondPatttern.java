package com.codegnan.patterns;

public class DiamondPatttern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5;
		//part 1 upper part of the diamond 
		for(int i=1;i<=rows;i++) {//outer for loop for rows
			//inner loop 1 print leading spaces
			for(int j=1;j<=rows-i;j++) {
				System.out.print("  ");//two spaces
			}
			//inner for loop2 to print stars
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		//lower part of diamond pattern
		for(int i=rows-1;i>=1;i--) {
			for(int j=1;j<=rows-i;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
