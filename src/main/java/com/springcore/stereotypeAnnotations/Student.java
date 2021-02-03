package com.springcore.stereotypeAnnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component("student")
public class Student {

    @Value("Akhilesh Garg")
    private String name;

    @Value("20")
    private int age;

    @Value("India")
    private String address;

    // passing collection type data using @Value annotation
    // using Spring Expression Language
    @Value("#{achievementList}")
    private ArrayList<String> achievements;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ",\n\tachievements=" + achievements +
                "\n}";
    }
}
