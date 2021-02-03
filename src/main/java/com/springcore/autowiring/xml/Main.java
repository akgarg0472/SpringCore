package com.springcore.autowiring.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("autowiringConfig/AutowiringXMLConfig.xml");

        Laptop laptopName = (Laptop) ac.getBean("laptopName");
        System.out.println("Autowiring by name: " + laptopName);

        Laptop laptopType = (Laptop) ac.getBean("laptopType");
        System.out.println("Autowiring by type: " + laptopType);

        Laptop laptopConstructor = (Laptop) ac.getBean("laptopConstructor");
        System.out.println("Autowiring by constructor: " + laptopConstructor);
    }
}
