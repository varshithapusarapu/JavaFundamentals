package com.codegnan.arrays;
import java.util.*;
public class FirstAndLastEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		if(n>=1) {
			if(arr[0]==arr[n-1]) {
				System.out.println(true);
			}
			else {
				System.out.println(false);
			}
		}
		sc.close();
		
	}

}
