package com.springcore.noXMLConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        // creating IoC Container using Configuration java file
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Programming programming = context.getBean("programming", Programming.class);
        System.out.println(programming);
    }
}
