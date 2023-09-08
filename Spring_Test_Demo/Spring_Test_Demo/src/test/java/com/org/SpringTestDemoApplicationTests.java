package com.org;

import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SpringTestDemoApplicationTests {

	@Autowired
	private TestRestTemplate temp;
	
	@Test
	public void hello_ok()throws Exception {
		
		ResponseEntity<String> res=temp.getForEntity("/hi",String.class);
		assertThat(res.getBody()).isEqualTo("Hello world,spring");	
//		assertEquals("Hello world,java", res.getBody());
		}

}
