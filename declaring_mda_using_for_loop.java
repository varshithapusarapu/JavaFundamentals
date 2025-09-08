package com.codegnan.arrays;

import java.util.Scanner;

public class declaring_mda_using_for_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int [] [] numbers= {{100,11,45},{60,80}};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of rows");
		int rows  =sc.nextInt();
		System.out.println("enter number of coloumns");
		int col =sc.nextInt();
		int [][]arr=new int[rows][col];
		System.out.println("enter elements into array");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				System.out.print("element["+i+"]["+j+"]:");
				arr[i][j]=sc.nextInt();
				
				
			}
		}
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();                                                               //sum of elements
			                                                                                   //row wise sum
		}
		System.out.println("printing 2d array in enhanced for loop");
		for(int[] row:arr) {
     		for(int x:row) {
     			
				System.out.print(x+" ");
			}
			System.out.println();
			sc.close();
		}

	}

}
