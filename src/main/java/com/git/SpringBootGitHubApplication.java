package com.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootGitHubApplication {

	public static void main(String[] args) {
		System.out.println("Application Start...");
		System.out.println("GitHub checking..");
		SpringApplication.run(SpringBootGitHubApplication.class, args);
	}

}
 