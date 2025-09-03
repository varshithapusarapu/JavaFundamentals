package com.codegnan.fundamentals;

import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int income=sc.nextInt();
		Double tax=(income<300000)?0.05:(income>=300000 && income<=1000000)?0.10:0.15;
		tax=(income>2000000)?tax*0.01*income:tax*income;
		System.out.println(tax);
		sc.close();

	}

}
