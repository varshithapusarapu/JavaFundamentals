package com.codegnan.fundamentals;

import java.util.Scanner;

public class MarksGrading {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Marks:");
		double marks= sc.nextDouble();
		String grade=(marks>=90)?"O":(marks>=80)?"S":(marks>=70)?"A":(marks>=60)?"B":(marks>=50)?"C":(marks>=35)?"D":"F";
		System.out.println(grade);
		sc.close();

	}

}
