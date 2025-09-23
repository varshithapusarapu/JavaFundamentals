package com.codegnan.superrr;

import java.util.Scanner;

public class test {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		My_calculation m=new My_calculation(a,b);
		m.add(a,b);
		m.multiply(a, b);
		sc.close();
	}

}
