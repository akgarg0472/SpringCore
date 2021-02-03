package com.springcore.autowiring.xml;

public class Laptop {
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
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "specs=" + specs +
                '}';
    }
}
