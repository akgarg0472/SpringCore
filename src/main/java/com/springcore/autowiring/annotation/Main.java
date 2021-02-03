package com.springcore.autowiring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("autowiringConfig/AutowiringAnnotationConfig.xml");

        Laptop laptop = (Laptop) ac.getBean("laptop");
        System.out.println(laptop);
    }
}
