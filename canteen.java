package com.codegnan.controlstatements;
import java.util.Scanner;

public class canteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int TEAPRICE = 10;
         int COFFEEPRICE = 15;
         int SAMOSAPRICE = 20;
         int choice;
        
        int teaQty = 0, coffeeQty = 0, samosaQty = 0;
        do {
            System.out.println("=========== CANTEEN MENU ===========");
            System.out.println("1. View Menu");
            System.out.println("2. Order Items");
            System.out.println("3. View Bill");
            System.out.println("4. Checkout and Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:  
                    System.out.println("\n--- MENU ---");
                    System.out.println("1. Tea     - " + TEAPRICE);
                    System.out.println("2. Coffee  - " + COFFEEPRICE);
                    System.out.println("3. Samosa  - " + SAMOSAPRICE);
                    break;

                case 2: 
                    System.out.print("Enter item number to order (1-3): ");
                    int item = sc.nextInt();

                    System.out.print("Enter quantity: ");
                    int qty = sc.nextInt();

                    if (qty <= 0) {
                        System.out.println("Quantity must be greater than 0.");
                        break;
                    }

                    switch (item) {
                        case 1:
                            teaQty += qty;
                            System.out.println(qty + " Tea added.");
                            break;
                        case 2:
                            coffeeQty += qty;
                            System.out.println(qty + " Coffee added.");
                            break;
                        case 3:
                            samosaQty += qty;
                            System.out.println(qty + " Samosa added.");
                            break;
                        default:
                            System.out.println("Invalid item number.");
                    }
                    break;
                case 3:
                    System.out.println("--- BILL ---");
                    double subtotal = 0;

                    if (teaQty > 0) {
                        int cost = teaQty * TEAPRICE;
                        System.out.println("Tea x " + teaQty + " = " + cost);
                        subtotal += cost;
                    }
                    if (coffeeQty > 0) {
                        int cost = coffeeQty * COFFEEPRICE;
                        System.out.println("Coffee x " + coffeeQty + " = " + cost);
                        subtotal += cost;
                    }
                    if (samosaQty > 0) {
                        int cost = samosaQty * SAMOSAPRICE;
                        System.out.println("Samosa x " + samosaQty + " = " + cost);
                        subtotal += cost;
                    }

                    if (subtotal == 0) {
                        System.out.println("No items ordered yet.");
                    } else {
                        double tax = subtotal * 0.05;
                        double total = subtotal + tax;
                        System.out.println("Subtotal = " + subtotal);
                        System.out.println("Tax (5%) = " + tax);
                        System.out.println("Total = " + total);
                    }
                    
                    break;
                case 4:
                    System.out.println("Thank you");
                    break;
                default:
                    System.out.println("Invalid choice. Please select between 1-4.");
            }
        }while (choice!=4);
        sc.close();
    }
}
