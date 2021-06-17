package com.captain.dbtut;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {
	
	@Autowired
	private UserRepository userRepo;
	
	@GetMapping("/")
	public String form() {
		return "index";
	}
	
	@PostMapping("/submit")
	public String success(User user) {
		
		userRepo.save(user);
		//ModelAndView mav = new ModelAndView("submit");
		//mav.addObject("user",user);
		System.out.println(user.getUser());
		System.out.println(user.getName());
		System.out.println(user.getPass());
		
		return "submit";
	}
	
	
	  @GetMapping("/login")
	  public String login(){ 
		  return "login"; 
	  }
	  
	  @PostMapping("/sublogin")
	  public String getlogin(String user,String pass) {
		  System.out.println(user);
		  System.out.println(pass);
		  
		  if(userRepo.existsById(user)) {
			  return "redirect1";
		  }
		  else {
			  return "redirect2";
		  }
	  }
	 
	
}
