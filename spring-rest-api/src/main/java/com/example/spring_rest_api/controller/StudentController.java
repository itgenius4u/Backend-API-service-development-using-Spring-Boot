package com.example.spring_rest_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_rest_api.entity.Student;
import com.example.spring_rest_api.service.StudentService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/api/v1")
public class StudentController {
    @Autowired
    private StudentService studentService;
    // GET /api/v1/students
    @GetMapping("/students")
    public ResponseEntity<List<Student>> getStudents() {
        List<Student> students = studentService.getStudentAll();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }
    // GET /api/v1/students/{id}
    public ResponseEntity<Student> getStudentById(@PathVariable("id") Integer id){
        Student student = studentService.getStudentById(id);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    // POST /api/v1/students
    public ResponseEntity<Student> createStudent(
        @RequestBody Student student){
        Student savedStudent = studentService.addStudent(student);
        return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
    }
    // DELETE /api/v1/students/{id}
    public ResponseEntity<String> deleteStudent(
        @PathVariable Integer id) {
            studentService.deleteStudent(id);
            return new ResponseEntity<>("ok", HttpStatus.NO_CONTENT);
        }
    // PUT /api/v1/students/{id}
    public ResponseEntity<Student> updateStudent(
        @PathVariable Integer id, @RequestBody Student student) {
           student.setStudentId(id);
           Student updatedStudent = studentService.updateStudent(student);
           return new ResponseEntity<>(updatedStudent, HttpStatus.NO_CONTENT);
    
    }
}