package com.codegnan.controlstatements;

import java.util.Scanner;

public class count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
//		String num=sc.next();
//		int length=num.length();
//		System.out.println(length);
		int num=sc.nextInt();
		int count=0;
		while(num!=0) {
			num/=10;
			count++;
		}
		System.out.println(count);
		sc.close();

	}

}
