package com.example.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsApplication.class, args);
	}
	public boolean test() {
		System.out.println("check the result");
		return true;
	}
}
