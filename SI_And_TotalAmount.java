package com.codegnan.fundamentals;
import java.util.*;

public class SI_And_TotalAmount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int p = sc.nextInt();
		int t = sc.nextInt();
		int r = sc.nextInt();
		int si=(p*t*r)/100;
		int total_amt=si+p;
		System.out.println(si);
		System.out.println(total_amt);
		sc.close();
	}

}
