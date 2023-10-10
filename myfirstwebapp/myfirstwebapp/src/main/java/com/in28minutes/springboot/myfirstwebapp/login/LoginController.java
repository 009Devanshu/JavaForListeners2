package com.in28minutes.springboot.myfirstwebapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	//http://localhost:8080/login/?name=Ranga
	@RequestMapping("login")
	public String gotoLoginPage(@RequestParam String name, ModelMap model) {
		model.put("name", name);
		logger.debug("Request Param is {}"+name);
		logger.info("I want this to be printed at info level");
		logger.warn("I want this to be printed at warn level");
		System.out.println("Request Param is: "+name); //Not recommended for PROD Code
		return "login";
	}
}
