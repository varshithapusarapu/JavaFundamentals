package com.codegnan.oopprogramming;



public class employeee {
	String name;
	double basicsalary;

	public employeee(String name, double basicsalary) {
		super();
		this.name = name;
		this.basicsalary = basicsalary;
	}
	public void calculateSalary() {
		System.out.println("basic Salary :"+basicsalary);	
		}
	
}

