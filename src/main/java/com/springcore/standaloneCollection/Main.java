package com.springcore.standaloneCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        // creating IoC container using standalone collection configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("standaloneCollectionConfig/StandaloneCollectionConfig.xml");

        Student student = (Student) context.getBean("student");
        System.out.println(student);
        System.out.println(student.getMarks().getClass().getName());
        System.out.println(student.getCourses().getClass().getName());
    }
}
