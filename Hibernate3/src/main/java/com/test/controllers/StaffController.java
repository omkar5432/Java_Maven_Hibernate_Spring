package com.test.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.dao.StaffDao;
import com.test.model.Staff;

@Controller
public class StaffController {
	
	@Autowired
	StaffDao sd;
	
	@RequestMapping(value="/sky",method=RequestMethod.POST)
	public String getdata(@ModelAttribute("s1") Staff s1)
	{
		sd.register(s1);
		return "dashboard";
	}
	

}
