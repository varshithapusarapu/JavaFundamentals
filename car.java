package com.codegnan.oopExamples;

public class car {
	String brand;
	String model;
	int year;
	public car() {
		//this constructor
		this(" ","unassigned");
		System.out.println("default Constructor");
	}
	public car(String brand, String model) {
		this(brand, model,0);
		this.brand = brand;
		this.model = model;
		System.out.println("2 arg constructor");
	}
	public car(String brand,String model,int year) {
		System.out.println("Parameter Constructor");
		this.brand=brand;
		this.model=model;
		this.year=year;
		System.out.println("3 arg constructor");
	}
	//copy constructor
	public car(car anotherCar) {
		this.brand=anotherCar.brand;
		this.model=anotherCar.model;
		this.year=anotherCar.year;
	}
//	public car() {
//		
//		System.out.println("default Constructor");
//	}
	
	//method
	public void displaycardetails() {
		System.out.println("Car Brand : "+brand);
		System.out.println("Car model : "+model);
		System.out.println("Car year : "+year);
	}
	
	public static void main(String[] args) {
		car defaultcar=new car();
		defaultcar.displaycardetails();
//		car defaul=new car("honda","xuv",2018);
//		defaul.displaycardetails();
//		System.out.println("copy constructor");
//		car copycar=new car(defaul);
//		copycar.displaycardetails();
		car c2=new car("suzuki","xav",2019);
		c2.displaycardetails();
		
	}

}
