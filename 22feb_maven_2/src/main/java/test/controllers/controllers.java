package test.controllers;
import java.util.List;

import org.springframework.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import test.beans.beans;
import test.dao.student_dao;

@Controller

public class controllers {
	@Autowired
	
	student_dao sd;
	
	@RequestMapping(value="/abc",method=RequestMethod.POST)
	public String display(@ModelAttribute("b1") beans b1)
	{
		sd.register(b1);
		return "redirect:/welcome";
		
	}
	
	@RequestMapping(value="/welcome")
	public String one(Model m)
	{
		List<beans> l1=sd.getInfo();
		m.addAttribute("l1",l1);
		return "welcome";
		
	}

}
