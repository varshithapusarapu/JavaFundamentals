package com.codegnan.controlstatements;

import java.util.Scanner;

public class AtmWithDrawal
{
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double AccountBalance=50000.0;
		System.out.println("enter withdraw ammount");
		double withDrawAmmount=sc.nextDouble();
		
		if(withDrawAmmount<=AccountBalance) {
			AccountBalance-=withDrawAmmount;
			System.out.println("withDrawAmmount: "+withDrawAmmount+"successfully...Avaliable balance is: "+AccountBalance);
		}
		else {
			System.out.println("InSufficient Funds");
		}
		sc.close();

	}

}
