package com.codegnan.arrays;

import java.util.Scanner;

public class colWiseSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		int sum=0;
		for(int j=0;j<col;j++) {
			for(int i=0;i<rows;i++) {
				 sum+=arr[i][j];
				
			}
			System.out.println("coloumn "+(j+1)+": "+sum);
		}sc.close();
		
	}

}
