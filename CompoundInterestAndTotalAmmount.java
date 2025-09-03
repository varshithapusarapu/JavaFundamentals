package com.codegnan.fundamentals;
import java.util.*;
public class CompoundInterestAndTotalAmmount {

	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Principal Amount: ");
	        double P = sc.nextDouble();

	        System.out.print("Enter Rate of Interest: ");
	        double R = sc.nextDouble();

	        System.out.print("Enter Time (in years): ");
	        double T = sc.nextDouble();

	        double A = (P * Math.pow((1 + R / 100), T))-P;
	        System.out.println(A);
	        System.out.println(A+P);
	        sc.close();
		// TODO Auto-generated method stub

	}

}
