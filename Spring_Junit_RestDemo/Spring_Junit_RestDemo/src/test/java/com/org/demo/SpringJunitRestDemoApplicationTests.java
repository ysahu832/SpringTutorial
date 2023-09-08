package com.org.demo;

import java.net.URI;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.util.UriComponentsBuilder;

@SpringBootTest(webEnvironment =WebEnvironment.RANDOM_PORT)
class SpringJunitRestDemoApplicationTests {
	    @Autowired
		private TestRestTemplate temp;
		
		@Test
		void testMessage() {
			String user="junit";
			URI targeturi =UriComponentsBuilder.fromUriString("/hello").queryParam("user",user).build().encode().toUri();
		    String mess =this.tempgetForObject(targeturi,String.class);
			assertEquals("Hello"+user+",Thanks for Subscription",mess);
		}

		private String tempgetForObject(URI targeturi, Class<String> class1) {
			// TODO Auto-generated method stub
			return null;
		}

		private void assertEquals(String string, String mess) {
			// TODO Auto-generated method stub
			
		}

	}
