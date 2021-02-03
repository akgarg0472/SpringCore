package com.springcore.dependencyInjection.reference;

public class Student {
    private String studentName;
    private Address studentAddress;
    private String studentClass;

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentAddress(Address studentAddress) {
        this.studentAddress = studentAddress;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentAddress=" + studentAddress +
                ", studentClass='" + studentClass + '\'' +
                '}';
    }
}
