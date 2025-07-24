package com.practise.app;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.practise.Entity.ProductDetails;
import com.practise.Entity.Products;
import com.practise.Utility.HibernateUtility;

public class SetProductDetails {

    public void setProductDetails() {
        // Logic to set product details
        System.out.println("Setting product details...");

        SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Products product = new Products();
        product.setName("Laptop");
        product.setPrice(75000);
        product.setQuantity(10);
        product.setManufacturer("HP");

        ProductDetails details = new ProductDetails();
        details.setWarrantyPeriod("3 years");
        details.setProductNumber(122345);

        // Setting the relationship
        product.setProductDetails(details);
        details.setProducts(product);

        session.persist(product);
        transaction.commit();
        session.close();
        System.out.println("Product details set successfully!");

    }

}
