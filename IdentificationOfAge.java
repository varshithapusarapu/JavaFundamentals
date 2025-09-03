package com.codegnan.fundamentals;

import java.util.Scanner;

public class IdentificationOfAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your age");
		double age= sc.nextDouble();
		String category=(age<=12)?"Child":(age>=12&&age<=19)?"Tennage":(age>=20&&age<=64)?"adult":"oldage";
		System.out.println(category);
		sc.close();
	}

}
