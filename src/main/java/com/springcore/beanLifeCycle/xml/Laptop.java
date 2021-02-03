package com.springcore.beanLifeCycle.xml;

public class Laptop {
    private String brand;
    private String model;
    private double price;

    public void setBrand(String brand) {
        System.out.println("setting laptop brand");
        this.brand = brand;
    }

    public void setModel(String model) {
        System.out.println("Setting laptop model");
        this.model = model;
    }

    public void setPrice(double price) {
        System.out.println("Setting laptop price");
        this.price = price;
    }

    public void init() {
        System.out.println("init() method called");
    }

    public void destroy() {
        System.out.println("destroy() method called");
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", model=" + model +
                ", price=$" + price +
                '}';
    }
}
