package com.codegnan.controlstatements;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int res=1;
		for(int i=1;i<=n;i++) {
			res=res*i;
		}
		System.out.println(res);
		sc.close();
	}

}

