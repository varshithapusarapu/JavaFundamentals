package com.codegnan.arrays;

import java.util.Scanner;

public class FirstAndLastElementMaxAndMakeMaxArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stubScanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int max=0;
		int [] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		if(n==3) {
			if(arr[0]>arr[1] && arr[0]>arr[2]) {
				max=arr[0];
			}else {
				if(arr[2]>arr[0] && arr[2]>arr[1]) {
					max=arr[2];
				}else {
					
				}
			}
			arr[1]=max;
			arr[2]=max;
			arr[0]=max;
		}
		
		System.out.println("["+arr[0]+","+arr[1]+","+arr[2]+"]");
		sc.close();
		

	}

}
