package com.org.gen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {
	
	@Autowired
	private JdbcTemplate jdbc;
	
	@RequestMapping("/data")
	public String index() {
		jdbc.execute("insert into people(id,first_name,last_name,age) values(10,'donu','seahu',27)");
		return "data inserted successfully";
	}
	
	@RequestMapping("/show")
	public String show_data() {
		return "hello";
	}
	
	@RequestMapping("/hello")
	public String show() {
		return "JDBC DEMO";
	}

}
