package com.codegnan.fundamentals;

import java.util.Scanner;

public class ShoppingBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double bill=sc.nextDouble();
		double dis,fp;
		if(bill>1000) {
			dis=bill*0.10;
			fp=bill-dis;
			System.out.println("Your Bill is"+fp);
		}
		else {
			System.out.println("your bill is"+bill);
		}
		sc.close();

	}
		
}
