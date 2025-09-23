package com.codegnan.oopprogramming;

import java.util.Scanner;

public class tesst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			String n=sc.next();
			double b=sc.nextDouble();
			employeee e=new employeee(n,b);
			Managerr m=new Managerr(n,b);
			e.calculateSalary();
			m.calculatesalary(5000);
			m.calculatesalary(5000,10000);
			
			
		}
	}

