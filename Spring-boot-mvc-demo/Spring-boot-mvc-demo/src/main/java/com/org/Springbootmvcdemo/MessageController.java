package com.org.Springbootmvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MessageController {
	
	
	@GetMapping("/message")
	public String displayMesage(Model model) {
		//handler method
		model.addAttribute("message","Hello Spring MVC!!!");
		return "messageView";
	}

	@GetMapping("/message2")
	public String displayMessage(Model model) {
		//handler method
		model.addAttribute("message2","Welcome to my Web!!!");
		return "messageView2";
	}

}
