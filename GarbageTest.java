package com.codegnan.oopExamples;

public class GarbageTest {
protected void finalize() {
	System.out.println("Garbage Collector Called Finalize Method");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GarbageTest obj=new GarbageTest();
		obj=null;
		System.out.println("Requesting garbage collection..............");
		System.gc();
		System.out.println("End of main");

	}

}
