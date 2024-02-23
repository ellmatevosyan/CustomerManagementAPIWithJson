package com.picsart.java;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DataInitializer {
    public static void initializeData(SessionFactory sessionFactory){
        try(Session session = sessionFactory.openSession()){
            Transaction transaction = session.beginTransaction();
            Customers customer1 = new Customers("John Doe", "john.doe@example.com", "123 Elm Street");
            Customers customer2 = new Customers("Jane Smith", "jane.smith@example.com", "456 Oak Avenue");
            Customers customer3 = new Customers("Alice Johnson", "alice.johnson@example.com", "789 Maple Lane");
            Customers customer4 = new Customers("Bob Brown", "bob.brown@example.com", "1011 Pine Road");
            Customers customer5 = new Customers("Emma Wilson", "emma.wilson@example.com", "1314 Cedar Court");

            session.persist(customer1);
            session.persist(customer2);
            session.persist(customer3);
            session.persist(customer4);
            session.persist(customer5);

            session.flush();
            transaction.commit();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
