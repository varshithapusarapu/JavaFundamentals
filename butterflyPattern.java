package com.codegnan.patterns;

public class butterflyPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//upper part of the butterfly pattern
		int rows=5;
		for(int i=1;i<=rows;i++) {
			//inner loop1:print the stars foe left wing
			for(int j=1;j<=i;j++) {
			System.out.print("* ");
		    }
			//System.out.println();
			//inner for loop 2:print the spaces between leftwing and rightwing.
			int spaces=2*(rows-i);
			for(int  j=1;j<=spaces;j++) {
				System.out.print("  ");
				
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		//lower part of the butterfly pattern
		for(int i=rows;i>=1;i--) {
			//inner for loop 1 print stars as left wing in bottom part
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			int spaces=2*(rows-i);
			for(int j=1;j<=spaces;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
