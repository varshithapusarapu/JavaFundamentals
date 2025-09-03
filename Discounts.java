package com.codegnan.fundamentals;

import java.util.Scanner;

public class Discounts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter purchase Ammount");
		double bill= sc.nextDouble();
		double discount=(bill>=100)?0.2:(bill>=50)?0.1:0.0;
		double disAmmount=bill*discount;
		double rAmmount=bill-disAmmount;
		double PercentDiscount=discount*100;
		System.out.println("Ammount after applying "+PercentDiscount+" % discount "+rAmmount);
		System.out.println("discount applied: "+disAmmount);
		sc.close();
		

	}

}
