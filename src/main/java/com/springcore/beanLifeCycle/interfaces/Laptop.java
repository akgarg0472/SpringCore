package com.springcore.beanLifeCycle.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Laptop implements InitializingBean, DisposableBean {
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

    @Override
    public void afterPropertiesSet() {
        System.out.println("init() (afterPropertiesSet()) called");
    }

    @Override
    public void destroy() {
        System.out.println("destroy() called");
    }
}
