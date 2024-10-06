package com.example.spring_rest_api.service;

import java.util.List;

import com.example.spring_rest_api.entity.Student;

public interface StudentService {
    List<Student> getStudentAll(); // GET
    Student getStudentById(int id); // GET
    Student addStudent(Student student); // POST
    Student updateStudent(Student student); // PUT
    void deleteStudent(int id);

}
