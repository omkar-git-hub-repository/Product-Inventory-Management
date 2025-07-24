package com.practise.app;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.practise.Entity.Products;
import com.practise.Utility.HibernateUtility;

public class AddProducts {
    

        public void addProduct(){

            // Logic to add products will go here
            System.out.println("Adding product...");

            SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
            // Create a session
            Session session = sessionFactory.openSession();
            // Begin transaction
            Transaction transaction = session.beginTransaction();


            // Create a new product
            Products product = new Products();
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter product ID: ");
            product.setId(scanner.nextInt());
            scanner.nextLine(); // Consume newline

            System.out.print("Enter product name: ");
            product.setName(scanner.nextLine());

            System.out.print("Enter product price: ");
            product.setPrice(scanner.nextDouble());

            System.out.print("Enter product quantity: ");
            product.setQuantity(scanner.nextInt());
            scanner.nextLine(); // Consume newline

            System.out.print("Enter product manufacturer: ");
            product.setManufacturer(scanner.nextLine());

            // Save the product to the database
            session.persist(product);
            // Commit the transaction
            transaction.commit();
            // Close the session
            session.close();

            System.out.println("Product added successfully!");
        }

}
