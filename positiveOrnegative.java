package com.codegnan.fundamentals;

import java.util.Scanner;

public class positiveOrnegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		double n= sc.nextDouble();
		String result=n>=0?"positive":"negative";
		System.out.println(result);
		sc.close();

	}

}
