package com.codegnan.controlstatements;

import java.util.Scanner;


public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int orig=n;
		int rem=0,digit=0;
		while(n!=0) {
			rem=n%10;
			digit=digit*10+rem;
			n=n/10;
			
		}System.out.println(digit);
		if(orig==digit) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
		sc.close();
	}

}
