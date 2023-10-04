package test.controllers;
import org.springframework.*;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import test.beans.Student;
import test.dao.StudentDao;

@Controller

public class controll_ {
	@Autowired
	StudentDao ss;
	
	@RequestMapping(value="/get",method=RequestMethod.POST)
	public String display(@ModelAttribute("s1") Student s1)
	{
		ss.register(s1);
		return "redirect:/welcome";	
	}
	
	@RequestMapping(value="/welcome")
	public String one(Model m)
	{
		List<Student> l1=ss.getInfo();
		m.addAttribute("l1",l1);
		return "welcome";
	}
	
	@RequestMapping(value="del/{id}",method=RequestMethod.GET)
	public String deletedata(@PathVariable int id)
	{
		ss.deleted(id);
		return "redirect:/welcome";
	}
	
	@RequestMapping(value="edit/{id}",method=RequestMethod.GET)
	public String editdata(@PathVariable int id,Model m)
	{
		Student t= ss.editd(id);
		m.addAttribute("command",t);
		return "edit";
		
	}
	
	//update
	
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String updatedata(@ModelAttribute("s1") Student s1)
	{
		ss.updated(s1);
		return "redirect:/welcome";
		
	}
	
	@RequestMapping("/file")
	public String disp()
	{
		return "file_upload";
	}
	
	@RequestMapping(value="/upload",method=RequestMethod.POST)
	public String up(@RequestParam CommonsMultipartFile file)
	{
		try
		{
		String path="C:\\Users\\Omkar Thube\\eclipse-workspace\\22FebMaven\\images";
		String filename=file.getOriginalFilename();
		
		System.out.println("Path is "+path);
		System.out.println("File Name "+filename);
		}

		catch(Exception e)
		{
			System.out.println("Fail");
		}
		return null;
	}
	
	
	@RequestMapping(value="/abc")
	public String login()
	{
		return "login";
	}
	
	@RequestMapping(value="/login_check", method=RequestMethod.POST)
	public String log(@RequestParam("name") String name, @RequestParam("email") String email,HttpSession s1)
	{
		Student tt=ss.login_check(name,email);
		if(tt!=null)
		{
			s1.setAttribute("email",email);
			return "redirect:/dashboard";
		}
		else
		{
			return "redirect:/abc";
		}
		
	}

	@RequestMapping(value="/dashboard")
	public String dashboard(HttpServletRequest req)
	{
		HttpSession s1 = req.getSession(false);
		String x=(String) s1.getAttribute("email");
		if(x==null || s1.getAttribute("email")==null) 
		{
			return "redirect:/abc";
		}
		else
		{
			return "dashboard";
		}
		
	}
	
	@RequestMapping(value="/logout")
	public String logout(HttpServletRequest req)
	{
		HttpSession s1 = req.getSession();
		s1.invalidate();
		return "login";
	}

}
