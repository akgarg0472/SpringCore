package com.springcore.beanLifeCycle.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        AbstractApplicationContext ac = new ClassPathXmlApplicationContext("lifeCycleConfig/AnnotationConfig.xml");
        ac.registerShutdownHook();

        Laptop laptop = (Laptop) ac.getBean("laptop");
        System.out.println(laptop);
    }
}