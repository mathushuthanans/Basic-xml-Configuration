package com.configs.controller;

import java.util.Scanner;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.configs.service.Details;

public class App 
{
    public static void main( String[] args )
    {
        // create Container 
        
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext("tree.xml");

        // get objects
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Number of Trees: ");
            int n = sc.nextInt();
            sc.nextLine(); 

            while(n-- > 0){
                Details details = context.getBean("detail", Details.class);
                details.write(sc);

                details.askDetails();
                
            }
        } catch (BeansException e) {
            e.printStackTrace();
        }
        
    }
}
