package com.example.spring_rest_api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring_rest_api.entity.Student;
import com.example.spring_rest_api.repository.StudentRepository;
@Service
public class StudentServiceImpl 
    implements StudentService{
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getStudentAll() {
        return studentRepository.findAll();
    }

}
