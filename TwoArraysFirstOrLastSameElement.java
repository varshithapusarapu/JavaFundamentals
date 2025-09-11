package com.codegnan.arrays;

import java.util.Scanner;

public class TwoArraysFirstOrLastSameElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		int m=sc.nextInt();
		int [] arr2=new int[m];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<m;i++) {
			arr2[i]=sc.nextInt();
		}
		if(n>=1) {
			if(arr[0]==arr2[0] || arr[n-1]==arr2[n-1]) {
				System.out.println(true);
			}
			else {
				System.out.println(false);
			}
		}
		sc.close();
		

	}

}
