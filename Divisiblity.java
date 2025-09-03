package com.codegnan.fundamentals;

import java.util.Scanner;

public class Divisiblity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter Number A:");
		int num= sc.nextInt();
		 String result = (num % 3 == 0 && num % 5 == 0) ? 
                 "Divisible by both 3 and 5" : 
                 (num % 3 == 0) ? "Divisible by 3" : 
                 (num % 5 == 0) ? "Divisible by 5" : 
                 "Not divisible by 3 or 5";
		System.out.println(result);
		sc.close();


	}

}
