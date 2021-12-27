package com.codegym;

public class TestStaticMethod {

    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(1,"ken1");
        Student s2 = new Student(2,"ken2");
        Student s3 = new Student(3,"ken3");

        s1.display();
        s2.display();
        s3.display();
    }
}
