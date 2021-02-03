package com.springcore.standaloneCollection;

import java.util.List;
import java.util.Map;

public class Student {
    private List<Integer> marks;
    private Map<String, Integer> courses;

    public List<Integer> getMarks() {
        return marks;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }

    public Map<String, Integer> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, Integer> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student {\n" +
                "\tmarks=" + marks +
                ",\n\tcourses=" + courses +
                "\n}";
    }
}
