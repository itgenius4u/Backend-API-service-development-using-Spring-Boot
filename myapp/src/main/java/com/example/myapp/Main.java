package com.example.myapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("이순신");
        AnnotationConfigApplicationContext context = 
        new AnnotationConfigApplicationContext(StudentConfig.class);
        Student student2 = context.getBean(Student.class);
        student2.setName("세종대왕");
        System.out.println(student2.getName());

        AnnotationConfigApplicationContext context2 = 
        new AnnotationConfigApplicationContext(StudentConfig2.class);
        Student2 student3 = context.getBean(Student2.class);
        student3.setName("세종대왕2");
        System.out.println(student3.getName());
    }
}
