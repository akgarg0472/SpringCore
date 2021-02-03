package com.springcore.dependencyInjection;

import com.springcore.dependencyInjection.primitive.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertyInjection {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("dependencyInjectionConfigs/PIConfig.xml");

        // requesting object of Student from IOC container which is accessed using ApplicationContext
        Student studentOne = (Student) ac.getBean("studentOne");
        System.out.println(studentOne);

        // value set using p schema
        Student studentP = (Student) ac.getBean("studentP");
        System.out.println(studentP);

        // value set using collection framework classes
        com.springcore.dependencyInjection.collection.Student studentCollection = (com.springcore.dependencyInjection.collection.Student) ac.getBean("studentCollection");
        System.out.println(studentCollection);
        System.out.println(studentCollection.getPhones().getClass().getName());

        // value set using reference type injection
        com.springcore.dependencyInjection.reference.Student studentReference = (com.springcore.dependencyInjection.reference.Student) ac.getBean("studentReference");
        System.out.println(studentReference);
    }
}
