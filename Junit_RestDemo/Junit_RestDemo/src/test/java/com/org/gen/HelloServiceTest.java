package com.org.gen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloServiceTest {
	
	@Autowired
	HelloService hello;
    
	@DisplayName("Test spring autowired integration")
	@Test
	void test() {
		assertEquals("Hello JUnit 5",hello.get());
	}

}
