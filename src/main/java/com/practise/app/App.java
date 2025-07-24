package com.practise.app;

import org.hibernate.SessionFactory;

import com.practise.Utility.HibernateUtility;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        SessionFactory sessionFactory = HibernateUtility.getSessionFactory();

    }
}
