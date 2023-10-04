package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class StudentControll 
{
	@Autowired
	StudentService ss;
	

	@RequestMapping("/")
	public String one()
	{
		return "index";
	}
	
	@PostMapping("/next")
	public String two(@ModelAttribute("s1") Student s1)
	{
		ss.getinfo(s1);
		return "redirect:/table";
	}
	
	@RequestMapping("/table")
	public String three(ModelMap m)
	{
		List<Student> l1=ss.getallstudent();
		m.addAttribute("l1", l1);
		return "table";
	}
	
	@RequestMapping("/back")
	public String four()
	{
		return "index";
	}

	
}
