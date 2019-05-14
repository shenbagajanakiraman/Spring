package com.stackroute.tasks.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        AccountVariable accVar = (AccountVariable) context.getBean("acc1");
        AccountVariable accVar1 = (AccountVariable) context.getBean("acc2");

        System.out.println(accVar);
        System.out.println(accVar1);

        Account acc = (Account) context.getBean("accob");








    }
}
