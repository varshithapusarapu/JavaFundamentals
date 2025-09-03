package com.codegnan.controlstatements;

import java.util.Scanner;

public class Atm_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double balance=50000;
		int pin=1234;
		int enteredPin;
		System.out.println("enter your pin.......");
		enteredPin=sc.nextInt();
		if(enteredPin!=pin) {
			System.out.println("Incorrect pin ...............");
		}
		int choice;
		do {
		System.out.println("==========================================");
		System.out.println("==========ATM MENU========================");
		System.out.println("==========1.CHECK BALANCE=================");
		System.out.println("==========2.DEPOSIT=======================");
		System.out.println("==========3.WITHDRAW======================");
		System.out.println("==========4.EXIT==========================");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Your Balance is "+balance);
			break;
		case 2:
			System.out.println("Enter deposit Ammount");
			double da=sc.nextDouble();//deposit ammount
			if(da%100!=0) {
				System.out.println("Please deposit 100 multiples of ammount" +"[700,10000,1200");
				
			}else {
				if(da<500) {
					System.out.println("please deposit more than 500");
				}else {
					balance+=da;
					System.out.println("Deposited:" +da+"Successfully............updated ammount is : "+balance);
				}
			}
			break;
		case 3:
			System.out.println("Enter withdrawal ammount");
			double wd=sc.nextDouble();
			if(wd%100!=0) {
				System.out.println("Please withdraw  100 multiples of ammount" +"[700,10000,1200");
				
			}else {
				if(wd<500) {
					System.out.println("please withdraw  more than 500");
				}else {
					if(wd>balance) {
						System.out.println("insufficient funds");
					}else {
						balance-=wd;
						System.out.println("withdrawed :" +wd+"Successfully............updated ammount is : "+balance);
				}
			}
			break;
			
		}
		case 4:
			System.out.println("Existing .....Thank you for using ATM");
			break;
			default:
				System.out.println("invalid choice pic an option from 1 to 4");
				break;
	}
		}while(choice!=4);
		sc.close();
	}
	

}
