package com.org.gen;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	
	@ResponseBody
	@GetMapping("/abc")
	public String hello() {
		return "Hello Controller";
		
	}

}
