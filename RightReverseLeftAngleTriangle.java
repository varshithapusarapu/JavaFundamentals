package com.codegnan.patterns;

public class RightReverseLeftAngleTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j;
		for(int i=0;i<5;i++) {
			for(int k=0;k<i;k++) {
				System.out.print("  ");
			}
			for( j=0;j<5-i;j++) {
				//System.out.print(j+" ");
				System.out.print("* ");
				//System.out.print((6-j)+" ");
				//System.out.print(i);
				//System.out.print((6-i)+" ");
				//System.out.print((char)(96+j)+" ");
				//System.out.print((char)(102-j)+" ");
				//System.out.print((char)(96+i)+" ");
				//System.out.print((char)(102-i)+" ");
			}
			System.out.println();  
			//move to next row
		}


	}

	}


