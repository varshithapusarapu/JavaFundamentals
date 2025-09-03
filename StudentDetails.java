package com.codegnan.fundamentals;

import java.util.Scanner;

public class StudentDetails {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String Name=sc.next();
		int Roll_no=sc.nextInt();
		char sec=sc.next().charAt(0);
		char grade =sc.next().charAt(0);
		System.out.println("welcome to codegnan "+Name+" your id is "+Roll_no+"\nyour section is "+sec+" And Your Grade is "+grade);
		sc.close();	
	}

}