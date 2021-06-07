package com.captain.LoginApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController{
	
	@RequestMapping("/")
	public String form(){
		return "index";
	}
	
	@PostMapping("/redirect")
	public String redirect(User user) {
		System.out.println(user.getUser());
		System.out.println(user.getPass());
		
		if(user.getUser().equals("admin") && user.getPass().equals("admin")) {
			return "redirect1";
		}
		else {
			return "redirect2";
		}
	
}
}
