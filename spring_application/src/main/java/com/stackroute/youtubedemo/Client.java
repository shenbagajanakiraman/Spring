package com.stackroute.youtubedemo;

import com.stackroute.Application;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {
    public static void main(String[] args) {
        // Object Construction  | Done by Developer
//
//        Employee eRef = new Employee();
//        eRef.setEname("Reshma");
//        eRef.setEid(1);
//        eRef.setEaddress("IBM : Manyata Tech Park");
//
//        System.out.println("Employee Details..."+eRef);

        // Spring way | Using IOC ( Inversion Of Control )

        ApplicationContext context = new ClassPathXmlApplicationContext("employeebean.xml");
//        Application application = context.getBean(Application.class);

//        Resource resource = new ClassPathResource("employeebean.xml");

        // Spring container which shall parse and construct the objects


        Employee employee = (Employee) context.getBean("employee"); // Type casting






    }
}
