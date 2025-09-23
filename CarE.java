package com.codegnan.oopExamples;

import java.util.Scanner;

public class CarE {
	private String model ;
	private int year;
	public void setmodel(String model) {
		this.model=model;
	}
	public String getmodel() {
		return model;
	}
	public void setyear(int year) {
		this.year=year;
	}
	public int getyear() {
		return year;
	}
	public static void main (String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter car model");
		String cmodel=sc.next();
		System.out.println("Enter manfacuture year");
		int cyear=sc.nextInt();
		CarE c=new CarE();
		c.setmodel(cmodel);
		c.setyear(cyear);
		System.out.println("car model : "+c.getmodel()+" car year : "+c.getyear());
	}
	
}
