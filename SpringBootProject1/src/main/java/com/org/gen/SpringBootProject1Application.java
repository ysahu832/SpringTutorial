package com.org.gen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class SpringBootProject1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProject1Application.class, args);
		System.out.println("Hello World");
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Application Runner Called !!");
		
	}

}
