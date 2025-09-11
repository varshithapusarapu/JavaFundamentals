package com.codegnan.arrays;

import java.util.Scanner;

public class RotatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		int d=1;
		int [] temp=new int[d];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}if(n==3) {
			for(int i=0;i<d;i++) {
				temp[i]=arr[i];
			}
			for(int i=d;i<n;i++) {
				arr[i-d]=arr[i];
			}
			for(int i=0;i<d;i++) {
				arr[n-d+i]=temp[i];
			}for(int i=0;i<n;i++) {
				System.out.print(arr[i]+" ");
			}
			
			
			
		}
		sc.close();
	}

}
