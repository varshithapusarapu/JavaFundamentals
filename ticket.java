package com.codegnan.controlstatements;

import java.util.Scanner;

public class ticket {
    public static void main(String[] args) {
        final double BASE_PRICE = 5000.0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter passenger type (child/senior/adult): ");
        String passengerType = sc.nextLine().toLowerCase();

        System.out.print("Enter booking time (early/normal): ");
        String bookingTime = sc.nextLine().toLowerCase();

        double discount = 0.0;

       
        if (passengerType.equals("child")) {
            discount = 0.50; 
        } else if (passengerType.equals("senior")) {
            discount = 0.20; 
        } else if (passengerType.equals("adult")) {
            discount = 0.0;  
        } else {
            System.out.println("Error: Invalid passenger type.");          
        }


        double finalPrice = BASE_PRICE - (BASE_PRICE * discount);

        if (bookingTime.equals("early")) {
            finalPrice = finalPrice - (finalPrice * 0.10);
        } else if (bookingTime.equals("normal")) {
           
        } else {
            System.out.println("Error: Invalid booking time.");
        }

        System.out.println("Final Ticket Price: ₹" + finalPrice);
        sc.close();
    }
}
