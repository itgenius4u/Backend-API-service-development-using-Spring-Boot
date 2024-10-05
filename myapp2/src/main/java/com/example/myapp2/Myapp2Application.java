package com.example.myapp2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Myapp2Application {

	public static void main(String[] args) {
		SpringApplication.run(Myapp2Application.class, args);
	}
	@Autowired
	private Student student;

	@GetMapping("/name")
	public String getStduentByName() {
		student.setName("강감찬");		
		return student.getName();
	}

}
