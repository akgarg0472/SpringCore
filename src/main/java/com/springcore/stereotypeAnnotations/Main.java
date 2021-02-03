package com.springcore.stereotypeAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("stereotypeAnnotations/StereotypeAnnotationsConfig.xml");

        Student student = (Student) context.getBean("student");
        System.out.println(student);

    }
}