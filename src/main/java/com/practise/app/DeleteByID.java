package com.practise.app;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.practise.Entity.Products;
import com.practise.Utility.HibernateUtility;

public class DeleteByID {

    public void deleteProductById() {

        SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
        // Create a session
        Session session = sessionFactory.openSession();
        // Begin transaction
        Transaction transaction = session.beginTransaction();

        // Fetch product by ID
        System.out.print("Enter product ID to delete: ");
        Scanner scanner = new Scanner(System.in);

        int productId = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Products p = session.find(Products.class, productId);
        session.remove(p);

        // Commit the transaction
        transaction.commit();
        // Close the session
        session.close();

        if (p != null) {
            System.out.println("Product with ID " + productId + " deleted successfully!");
        } else {
            System.out.println("Product with ID " + productId + " not found.");
        }

    }

}
