package com.codegnan.arrays;

import java.util.Scanner;

public class sumarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int [][] arr=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print("element ["+i+"]["+j+"]:");
				arr[i][j]=sc.nextInt();
				
			}
		}
		int sum=0;
		for(int []rows:arr) {
			for(int x:rows) {
				sum=sum+x;
				
			}
		}System.out.println(sum);
		sc.close();

	}

}
