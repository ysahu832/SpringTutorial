package com.org.gen;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloServiceMockTest {
	
	@Mock
	private HelloRepository h;
	
	@InjectMocks
	private HelloServiceImpl helloService = new HelloServiceImpl();
	
	@BeforeEach
	void setMockOutput() {
		when(h.get()).thenReturn("hello Mockito from Repository");
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
