package com.codegnan.controlstatements;

import java.util.Scanner;

public class SumOfNumbersUsingLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		//int i=0;
		int rem=0;
		while(num!=0) {
			rem=num%10;                          // 1234%10=4;
			sum+=rem;
			num=num/10;
			//i++;
		}
		System.out.println(sum);
		sc.close();
		

	}

}
