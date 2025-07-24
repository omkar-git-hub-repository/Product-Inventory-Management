package com.practise.app;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.practise.Entity.Products;
import com.practise.Utility.HibernateUtility;

public class ViewAllProducts {
    
    public void viewProducts() {
        // Logic to view all products will go here
        System.out.println("Viewing all products...");

        SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
        // Create a session
        Session session = sessionFactory.openSession();
        // Begin transaction
        Transaction transaction = session.beginTransaction();

        // Fetch all products from the database
        List<Products> productsList = session.createQuery("Select p from Products p", Products.class).getResultList();
        
        // Print all products
        for (Products product : productsList) {
            System.out.println(product);
        }

        // Commit the transaction
        transaction.commit();
        // Close the session
        session.close();
        System.out.println("\nAll products viewed successfully!");
    }
    
}
