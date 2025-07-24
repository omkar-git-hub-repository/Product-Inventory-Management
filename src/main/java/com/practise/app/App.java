package com.practise.app;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // switch case to handle different operations
       System.out.println("Welcome to Product Inventory Manager");
         System.out.println("1. Add Product" +
                "\n2. View all Products" +
                "\n3. Update quantity" +
                "\n4. Delete Product by ID" +
                "\n5. Exit");

         Scanner scanner = new Scanner(System.in);
         int choice = scanner.nextInt();

         switch (choice) {
             case 1:
                 // Add Product
                 AddProducts addProducts = new AddProducts();
                 addProducts.addProduct();
                 break;
             case 2:
                 // View all Products
                 break;
             case 3:
                 // Update quantity
                 break;
             case 4:
                 // Delete Product by ID
                 break;
             case 5:
                 System.out.println("Exiting...");
                 System.exit(0);
                 break;
             default:
                 System.out.println("Invalid choice. Please try again.");
         }

    }
}
