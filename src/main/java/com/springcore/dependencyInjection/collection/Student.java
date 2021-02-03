package com.springcore.dependencyInjection.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {
    private String employeeName;
    private List<String> phones;
    private Set<String> addresses;
    private Map<String, String> courses;
    private Properties properties;

    // default constructor
    public Student() {
        super();
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public void setAddresses(Set<String> addresses) {
        this.addresses = addresses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public List<String> getPhones() {
        return phones;
    }

    @Override
    public String toString() {
        return "Student{" +
                "employeeName='" + employeeName + '\'' +
                ", phones=" + phones +
                ", addresses=" + addresses +
                ", courses=" + courses +
                ", properties=" + properties +
                '}';
    }
}
