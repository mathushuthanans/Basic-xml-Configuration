package com.configs.controller;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.configs.service.Register;

public class Main {
    
    public static void main(String[] args) {
        
        // container
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("sells.xml");
        Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the Number of Products: ");
            int n = sc.nextInt();
            sc.nextLine();

            while (n-- > 0) {
                Register reg = context.getBean("reg", Register.class);
                reg.addDetails(sc);
            }
        }
   

    }
}
