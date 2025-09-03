package com.codegnan.fundamentals;

import java.util.Scanner;

public class TimeandEvent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Time");
		int Time = sc.nextInt();
		String category=(Time>=5&&Time<12)?"Good Morning":(Time>=12&&Time<17)?"Good Afternoon":(Time>=17&&Time<22)?"Good Evening":"Good night";
		System.out.println(category);
		sc.close();

	}

}
