package com.springcore.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@SuppressWarnings("unused")
public class Laptop {
    @Autowired
    @Qualifier("specs1")
    private Specs specs;

    public Laptop() {
        super();
        System.out.println("Default constructor called");
    }

    public Laptop(Specs specs) {
        this.specs = specs;
        System.out.println("Parameterized Constructor called");
    }

    public void setSpecs(Specs specs) {
        this.specs = specs;
        System.out.println("specs setter called");
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "specs=" + specs +
                '}';
    }
}
