package com.springcore.beanScope;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Smartphone {
    @Value("Apple")
    private String brand;
    @Value("iPhone 12 Pro Max")
    private String model;

    @Override
    public String toString() {
        return "Smartphone = (" + this.hashCode() + ") {\n" +
                "\tbrand='" + brand + '\'' +
                ",\n\tmodel='" + model + '\'' +
                "\n}";
    }
}
