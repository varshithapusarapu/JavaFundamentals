package com.codegnan.fundamentals;

import java.util.Scanner;

public class GreaterofTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter Number A:");
		int A= sc.nextInt();
		System.out.println("enter Number B:");
		int B= sc.nextInt();
	    String result=A>B?A+"is big":B+"is big";
		System.out.println(result);
		sc.close();


	}

}
