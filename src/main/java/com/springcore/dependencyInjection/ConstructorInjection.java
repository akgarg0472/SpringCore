package com.springcore.dependencyInjection;

import com.springcore.dependencyInjection.constructor.Computer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjection {

    public static void main(String[] args) {
        // creating IOC container using XML configuration
        ApplicationContext ac = new ClassPathXmlApplicationContext("dependencyInjectionConfigs/CIConfig.xml");

        // obtaining computer object from IOC Container
        // and initialized for primitive and reference type
        // Computer computer = (Computer) ac.getBean("computer");
        // System.out.println(computer);

        // obtaining object from IOC container and setting collection type value
        // because this is just for practice, passed value is directly printed in constructor, so no need to print object using toString() method
        Computer computer = (Computer) ac.getBean("computer");
    }
}
