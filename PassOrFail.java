package com.codegnan.fundamentals;

import java.util.Scanner;

public class PassOrFail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your marks:");
		int A= sc.nextInt();
	    String result=A>35?"pass":"fail";
		System.out.println(result);
		sc.close();

	}

}
