package com.org.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Autowired
	private MessageService msg;
	
	@GetMapping("/hello")
	public String sayHello(@RequestParam String user) {
		return msg.getSubscriptionMessage(user);
	}
	

}
