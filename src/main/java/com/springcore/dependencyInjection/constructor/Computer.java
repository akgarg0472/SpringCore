package com.springcore.dependencyInjection.constructor;

import java.util.List;

public class Computer {
    private String brand;
    private String model;
    private Specifications specifications;

    public Computer(String brand, String model, Specifications specifications) {
        this.brand = brand;
        this.model = model;
        this.specifications = specifications;
        System.out.println("Constructor called");
    }

    public Computer(List<String> specs) {
        System.out.println(specs);
    }

    // demo constructor for demonstration of constructor ambiguity
    // ambiguity because by default IOC container set value as string but if we want to pass value in int one constructor
    // then we have to explicitly tell the IOC container that we want to pass value as int
    // and this is done in configuration file using type="int" attribute or respective type whatever we want
    public Computer(String brand, int model, Specifications specifications) {
        System.out.println(brand + ", " + model + ", " + specifications);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", specifications=" + specifications +
                '}';
    }
}
