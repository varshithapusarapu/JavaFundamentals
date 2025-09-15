package com.codegnan.oopExamples;

public class Person {
	String name;
	int age;
	public Person(String name,int age) {
		System.out.println("vghsav");
		this.name=name;
		this.age=age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person("varshi",21);
		System.out.println(p1.name+"................"+p1.age);
		Person p2=new Person("vijju",21);
		System.out.println(p2.name+"................"+p2.age);
		
	}

}
