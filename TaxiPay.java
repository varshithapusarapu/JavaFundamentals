package com.codegnan.fundamentals;

import java.util.Scanner;

public class TaxiPay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter km");
		double km = sc.nextDouble();
		double category=(km<=2)?50:
						(km<=10)?(50+(km-2)*15):
						(50+(8*15)+(km-10)*10);
		category=(km>20)?category*0.95:category;
		System.out.println(category);
		sc.close();

	}

}
