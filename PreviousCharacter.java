package com.codegnan.fundamentals;

import java.util.Scanner;

public class PreviousCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		char result=(char)(--n);
		System.out.println(result);
		sc.close();

	}
}
