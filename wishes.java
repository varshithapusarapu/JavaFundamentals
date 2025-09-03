package com.codegnan.controlstatements;

import java.util.Scanner;

public class wishes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter City Name");
		String city =sc.next();
		if(city.equalsIgnoreCase("hyderabad")) {
			System.out.println("hello hyderabadi..........adaaab.......");
		}else {
			if(city.equals("Banglore")) {
				System.out.println("hello kannadaga..........namsakar.......");
			}else {
				if(city.equals("chennai")) {
					System.out.println("hello madrasi..........vanakam.......");
				}
				else {
					System.out.println("enter valid city name");
				}
				
			}
			
		}
		sc.close();
	}

}
