package com.example.myapp3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Myapp3Application {

	public static void main(String[] args) {
		SpringApplication.run(Myapp3Application.class, args);
	}
	@Autowired
	private DatabaseManager databaseManager;
	@GetMapping("/db")
	public String getDatabaseOpen() {
		return databaseManager.getDatabaseOpen();
	}

}
