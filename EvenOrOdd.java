
package com.codegnan.fundamentals;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);	
		System.out.println("enter a number");
		int n= sc.nextInt();
		String result=n%2==0?"even":"odd";
		System.out.println(result);
	    sc.close();
	    	
	}

}
