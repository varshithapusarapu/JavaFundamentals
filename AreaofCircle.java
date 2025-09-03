package com.codegnan.fundamentals;
import java.util.*;
public class AreaofCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter radius");
		int radius=sc.nextInt();
		double area=3.14*radius*radius;
		System.out.println("the area of circle"+area);
		sc.close();
		}

}
