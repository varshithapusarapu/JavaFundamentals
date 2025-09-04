package com.codegnan.controlstatements;

import java.util.*;

public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int orig=m;
		int n=m;
		int rem=0,digit=0;
		int s=0;
		while(m!=0) {
			m=m/10;
			digit++;
		}System.out.println(digit);
		while(n!=0) {
			rem=n%10;
			s+=Math.pow(rem, digit);
			n=n/10;
			
		}System.out.println(s);
		if(orig==digit) {
			System.out.println("Armstrong");
		}else {
			System.out.println("not Armstrong");
		}
		sc.close();
	}

}
