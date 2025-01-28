package com.configs.repo;

import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.configs.service.Product;

public class Hib{

    public void save(Product product){
        // Config to open a session, get the transaction, save and close all
        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(com.configs.service.Product.class);
        cfg.configure("hibernate.cfg.xml");

        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(product);
        transaction.commit();
        session.close();
        sessionFactory.close();

        System.out.println(product);
        
    }
}