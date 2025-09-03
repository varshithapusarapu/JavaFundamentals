package com.codegnan.fundamentals;

import java.util.Scanner;

public class TernaryOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your age:");
		int age= sc.nextInt();
		String result=age>=18?"major":"minor";
		System.out.println(result);
		sc.close();

	}

}
