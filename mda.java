package com.codegnan.arrays;

public class mda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][][] a= {{{10,20,30},{40,50}},{{60},{70,80},{90,100,110}}};
		System.out.println(a[0][1][1]);//50
		//System.out.println(a[1][0][2]);//0
		System.out.println(a[1][2][1]);//100
		System.out.println(a[1][2][2]);//110
		//System.out.println(a[2][1][0]);//0
		System.out.println(a[1][1][1]);//80
	}

}
