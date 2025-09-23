package com.codegnan.superrr;

import java.util.Scanner;

public class Employee_info extends Employee {
	double salary_per_year;
	public Employee_info() {
		super("","",0);	
	}
	public void inputEmployeeDetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee name");
		name=sc.next();
		System.out.println("enter designation");
		designation=sc.next();
		System.out.println("enter year of expierence");
		years_of_expierence=sc.nextInt();
		System.out.println("salary per year");
		salary_per_year=sc.nextDouble();	
	}
	public void displayEmployeeInfo() {
		System.out.println("name :"+name);
		System.out.println("Designation :"+designation);
		System.out.println("years_of_expierence: "+years_of_expierence);
		
	}
	public void calculatesalary() {
		double salary=salary_per_year*years_of_expierence;
		System.out.println("Salary years :"+salary);
	}
	

}
