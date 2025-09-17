package com.codegnan.oopExamples;

public class BoxDemo {
	double height;
	double width;
	double depth;
	//instance method without return without para
	
	public void volume() {
		System.out.print("Box Volume is(without return and parameters): ");
		System.out.println(height*width*depth);
	}
	//without return without parameters
	public void setdim(double h,double w,double d) {
		double volume=h*w*d;
		System.out.println("Box Volume is(without return and with parameters): "+volume);
	}
	//with return and without parameters
	public double vol() {
		return height*width*depth;
	}
	//with return and with parameters
	public double calvol(double height, double width, double depth) {
		return height*width*depth;
	}
	public BoxDemo(double height, double width, double depth) {
		super();
		this.height = height;
		this.width = width;
		this.depth = depth;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoxDemo b1=new BoxDemo(3.0,2.0,7.0);
		b1.volume();
		b1.setdim(2.0,3.0,9.0);
		BoxDemo b2=new BoxDemo(4.0,6.0,8.0);
		System.out.println("Box Volume is(with return and without parameters): "+b2.vol());
		System.out.println("Box Volume is with (with parameters and return)69999: "+b2.calvol(4.0,3.0,9.0));
		
		
		
		
	}

}
