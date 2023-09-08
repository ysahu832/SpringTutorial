package com.org.gen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class SpringJdbcAppApplication implements CommandLineRunner{
	
	@Autowired
//	private JdbcTemplate jdbc;
	

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		String sql="insert into people(id,first_name,last_name,age) values(?,?,?,?)";
//		int result =jdbc.update(sql,6,"yash","sahu",23);
//		if(result > 0) {
//			System.out.println("New row inserted");
//		}
		System.out.println("data base operation example");
	}

}
