package com.example.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}

}

@RestController
class Helloworld {
	@GetMapping("/")
	public String greet() {
		return "Hello! This is Test Homepage";
	}
}