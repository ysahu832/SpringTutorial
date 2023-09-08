package com.org.gen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	@Autowired
	private UserRepository user;
	
	@RequestMapping("/add")
	public String addNewUser(@RequestParam("name") String name,@RequestParam("email") String email) {
		
		MyUser u = new MyUser();
		u.setName(name);
		u.setEmail(email);
		user.save(u);
		return "Saved";
		
	}
	
	@RequestMapping("/all")
	public @ResponseBody Iterable<MyUser> getAll(){
		return user.findAll();
	}

}
