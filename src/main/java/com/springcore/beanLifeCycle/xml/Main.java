package com.springcore.beanLifeCycle.xml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        // AbstractApplicationContext is used because we want to use registerShutdownHook method
        // which is not available in the ApplicationContext interface
        AbstractApplicationContext ac = new ClassPathXmlApplicationContext("lifeCycleConfig/XMLConfig.xml");

        // init() method is called after when the values are injected by IOC container in the bean
        Laptop laptop = (Laptop) ac.getBean("laptop");
        System.out.println(laptop);

        // this method tells IOC container that calls the destructor method which we have declared in XML configuration
        // and destroy the bean when JVM is terminated
        ac.registerShutdownHook();

        System.out.println("All operation done");
    }
}
