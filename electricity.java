package com.codegnan.controlstatements;

import java.util.Scanner;

public class electricity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int unit=sc.nextInt();
		double fare,dis;
		if(unit<=100) {
			fare=unit*1.50;
			System.out.println(fare);
		}else {
			if(unit>=101 && unit<=200){
				fare=unit*2;
				System.out.println(fare);
			}else {
				if(unit>=201 && unit<=300) {
					fare=unit*3;
					System.out.println(fare);
				}else {
					if(unit>=300) {
						fare=unit*5;
						if(fare>1000) {
							dis=fare*0.1;
							fare=fare-dis;
							System.out.println(fare);
						}
						else {
							System.out.println(fare);
						}
					}
				}
			}
		}
		sc.close();

	}

}
