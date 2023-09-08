package com.org.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBoot_Junit5_service_test {
	
	@Autowired
	private MessageService m;
	
	@Test
	void testSubscription() {
		String user ="junit";
		String msg=m.getSubscriptionMessage(user);
		assertEquals("Hello"+user+",Thanks for Subscriptiion",msg);
	}

	private void assertEquals(String string, String msg) {
		// TODO Auto-generated method stub
		
	}

}
