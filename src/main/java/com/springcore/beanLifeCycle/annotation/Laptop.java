package com.springcore.beanLifeCycle.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Laptop {
    private final String brand;
    private final String model;
    private final double price;

    public Laptop(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", model=" + model +
                ", price=$" + price +
                '}';
    }

    @PostConstruct
    public void init() {
        System.out.println("init() method called");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy() method called");
    }
}
