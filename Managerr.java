package com.codegnan.oopprogramming;

public class Managerr extends employeee {
		public Managerr(String name, double basicsalary) {
			super(name, basicsalary);
		}

		public void calculatesalary(double bonus) {
			System.out.println("total salary :"+(basicsalary+bonus));
		}
		public void calculatesalary(double bonus,double allowance) {
			System.out.println("total salary :"+(basicsalary+allowance+bonus));
		}


}
