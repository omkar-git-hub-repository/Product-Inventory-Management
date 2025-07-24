package com.practise.app;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.practise.Entity.Products;
import com.practise.Utility.HibernateUtility;

public class UpdateQuantity {

    public void updateProductQuantity(){

        // Logic to update product quantity will go here
        System.out.println("Updating product quantity...");
        SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
        // Create a session
        Session session = sessionFactory.openSession();
        // Begin transaction
        Transaction transaction = session.beginTransaction();

        // Fetch product by ID
        System.out.print("Enter product ID to update quantity: ");
        Scanner scanner = new Scanner(System.in);

        int productId = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Products p = session.find(Products.class, productId);
        if (p != null) {
            System.out.print("Current quantity: " + p.getQuantity() + ". Enter new quantity: ");
            int newQuantity = scanner.nextInt();
            p.setQuantity(newQuantity);

            // Update the product in the database
            session.persist(p);
            // Commit the transaction
            transaction.commit();
            System.out.println("Product quantity updated successfully!");
        } 
        else 
        {
            System.out.println("Product with ID " + productId + " not found.");
        }

    }
    
}
