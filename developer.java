package com.codegnan.oopprogramming;

public class developer extends  Employee {
	String programminglanguage;
	public developer(String name,double salary,String programminglanguage) {
		this.name=name;
		this.salary=salary;
		this.programminglanguage=programminglanguage;
	}
	public void displayDetails() {
		System.out.println("Developer Details");
		System.out.println("name :"+name);
		System.out.println("Salary: "+salary);
		System.out.println("programming Language :"+programminglanguage);
	}
	}


