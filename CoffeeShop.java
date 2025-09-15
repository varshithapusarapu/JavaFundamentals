package com.codegnan.oopExamples;

import java.util.Scanner;

public class CoffeeShop {
	String CoffeeType;
	String Size;
	String SugarPreference;
	public CoffeeShop(String coffee,String Size,String Sugar) {
		this.CoffeeType=coffee;
		this.Size=Size;
		this.SugarPreference=Sugar;
		
	}
	 public void displayOrder() {
	        System.out.println("Coffee Type: " + CoffeeType);
	        System.out.println("Size: " + Size);
	        System.out.println("Sugar: " + SugarPreference);
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    CoffeeShop c1 = new CoffeeShop("Latte", "Small", "Yes");
	        CoffeeShop c2 = new CoffeeShop("Espresso", "Medium", "No");
	        CoffeeShop c3 = new CoffeeShop("Cappuccino", "Large", "Yes");
	        c1.displayOrder();
	        c2.displayOrder();
	        c3.displayOrder();
	}

}
