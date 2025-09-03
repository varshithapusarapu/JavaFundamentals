package com.codegnan.controlstatements;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int res;
		for(int i=1;i<=20;i++) {
			res=n*i;
			System.out.println(n+" * "+i+" = "+res);
		}
		sc.close();

	}

}
