package com.codegnan.oopExamples;

public class Employee {
	String name;
	double basicSalary;
	public void setDetails(String n,double salary) {
		name=n;
		basicSalary=salary;
		
	}
	public double calculateHRA() {
		return 0.20*basicSalary;
	}
	public double calculateDA() {
		return 0.10*basicSalary;
	}
	public double grossSalary() {
		return basicSalary+calculateHRA()+calculateDA();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		e1.setDetails("varshi",50000);
		System.out.println("HRA ALLOWANCE IS : "+e1.calculateHRA());
		System.out.println("DA ALLOWANCE IS : "+e1.calculateDA());
		System.out.println("Employee name : "+e1.name);
		System.out.println("Employee Basic Salary : "+e1.basicSalary);
		System.out.println("Employee Gross Salary : "+e1.grossSalary());
		
	}

}
