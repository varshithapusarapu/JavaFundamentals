package com.codegnan.controlstatements;

import java.util.Scanner;

public class ReverseOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rem,revn=0;
		while(n!=0) {
			rem=n%10;                   // 345 1===> 345%10=5,0+5=5,345/10=34;  2==> 34%10=4,5*10+4=54,34/10=3; 3===> 3%10=3,54*10+3=543,3/10 =0
			revn=revn*10+rem;
			n=n/10;
		}
		if(revn>0) {
			System.out.println(revn);
		}else {
			System.out.println(-(revn));
		}
		sc.close();
		
	}

}
