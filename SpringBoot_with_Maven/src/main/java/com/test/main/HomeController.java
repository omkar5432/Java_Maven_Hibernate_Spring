package com.test.main;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/")
	public String one()
	{
		return "Welcome";
	}
	
	@RequestMapping("/about")
	public String two()
	{
		return "Maven";
	}

}
