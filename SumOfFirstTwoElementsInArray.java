package com.codegnan.arrays;

import java.util.*;

public class SumOfFirstTwoElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		int sum=0;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		if(n==0) {
			sum=0;
		}
		else {
			sum=arr[0]+arr[1];
		}
		System.out.println(sum);
		sc.close();
	}

}
