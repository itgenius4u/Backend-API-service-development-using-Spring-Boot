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
    @Override
    public Student getStudentById(int id) {
        return studentRepository.findById(id).get();
    }
    @Override
    public Student addStudent(Student student) {
       return studentRepository.save(student);
    }
    @Override
    public Student updateStudent(Student student) {
        Student existedStudent 
            = studentRepository.findById(student.getStudentId()).get();
        existedStudent.setStudentName(student.getStudentName()); 
        return existedStudent; 
    }
    @Override
    public void deleteStudent(int id) {
        studentRepository.deleteById(id);
    }
}
