package com.codegnan.fundamentals;

import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your year:");
		int year= sc.nextInt();
	    String result=year%4==0?"Leap Year":"not Leap Year";
		System.out.println(result);
		sc.close();


	}

}
