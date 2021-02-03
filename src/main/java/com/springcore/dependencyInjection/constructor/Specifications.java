package com.springcore.dependencyInjection.constructor;

public class Specifications {
    private String CPU;
    private String RAM;
    private String storage;

    public Specifications(String CPU, String RAM, String storage) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Specifications{" +
                "CPU='" + CPU + '\'' +
                ", RAM=" + RAM +
                ", storage=" + storage +
                '}';
    }
}
