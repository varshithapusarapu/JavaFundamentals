package com.codegnan.arrays;
import java.util.Scanner;
public class simple {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		String fruits[]= {"apple","bananan","guava","kiwi","tomato"};
//		for(int i=0;i<fruits.length;i++) {
//			System.out.println(fruits[i]);
//		}
//		System.out.println("Enhanced loop");
//		for(String fruit:fruits) {
//			System.out.println(fruit);
//		}
		System.out.println("enter array size");
		int size=sc.nextInt();
		int [] num=new int[size];
		for(int i=0;i<size;i++) {
			num[i]=sc.nextInt();		
		}
		for(int n:num) {
			System.out.println("elements are");
			System.out.println(n);
		}
		sc.close();	
	}

}
