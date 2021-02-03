package com.springcore.beanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beanScope/BeanScopeSingletonConfig.xml");
        // all hash codes will be same for singleton bean scope
        System.out.println(context.getBean("smartphone"));
        System.out.println(context.getBean("smartphone"));
        System.out.println(context.getBean("smartphone"));

        System.out.println("--------------------------------------------");

        // to change scope, we can either use XML configuration using scope="scopeName" attribute
        // or we can use annotation @Scope("scopeName") to define scope
        context = new ClassPathXmlApplicationContext("beanScope/BeanScopePrototypeConfig.xml");
        // all hash codes will be different for proto type bean scope
        System.out.println(context.getBean("smartphone"));
        System.out.println(context.getBean("smartphone"));
        System.out.println(context.getBean("smartphone"));
    }
}
