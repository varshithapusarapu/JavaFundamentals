package com.codegnan.oopExamples;
import java.util.Date;

public class RunTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime r=Runtime.getRuntime();
		System.out.println("Total memory of the heap: "+r.totalMemory());
		System.out.println("free memory of the heap: "+r.freeMemory());
		for(int i=0;i<1000000;i++) {
			Date d=new Date();
			d=null;
		}
		System.out.println("free memory of the heap: "+r.freeMemory());
		r.gc();
		System.out.println("free memory of the heap: "+r.freeMemory());
	}

}
