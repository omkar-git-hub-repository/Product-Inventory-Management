package com.practise.app;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        // switch case to handle different operations
        System.out.println("Welcome to Product Inventory Manager");
        System.out.println("1. Add Product" +
                "\n2. View all Products" +
                "\n3. Update quantity" +
                "\n4. Delete Product by ID" +
                "\n5. Set Product Details" +
                "\n6. Exit");

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
                ViewAllProducts viewAllProducts = new ViewAllProducts();
                viewAllProducts.viewProducts();
                break;
            case 3:
                // Update quantity
                UpdateQuantity updateQuantity = new UpdateQuantity();
                updateQuantity.updateProductQuantity();
                break;
            case 4:
                // Delete Product by ID
                DeleteByID deleteByID = new DeleteByID();
                deleteByID.deleteProductById();
                break;
        
            case 5:
                // Set Product Details
                SetProductDetails setProductDetails = new SetProductDetails();
                setProductDetails.setProductDetails();
                break;

            case 6:
                // Exit
                System.out.println("Exiting the application. Goodbye!");
                scanner.close();
                return;
                
            default:
                System.out.println("Invalid choice. Please try again.");
        }

    }
}
