package com.codegnan.fundamentals;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter breadth");
		int breadth=sc.nextInt();
		System.out.println("enter width");
		int width=sc.nextInt();
		double area=(int)(0.5*breadth*width);
		System.out.println("the area of triangle"+area);
		sc.close();

	}

}
