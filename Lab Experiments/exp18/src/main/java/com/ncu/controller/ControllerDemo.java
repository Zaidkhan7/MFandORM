package com.ncu.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ncu.models.Users;

@Controller
public class ControllerDemo {

	
	@RequestMapping("/init")
	public String initView(Model model) {
	System.out.println("Handler method is called.");

	 model.addAttribute("welcome_msg", "Spring Mvc Internationalization Example");
	return "Welcome";
	}
	@RequestMapping("/start")
	public String welcomemsg(Model model,@ModelAttribute("user") Users user) {
		model.addAttribute("msg",new Users());
		return "FirstPage";
	}
	
	@RequestMapping(path = "/signup",method = RequestMethod.POST)
	public String HelloSignup(Model model , @Valid @ModelAttribute("user") Users user, BindingResult br) {
		
		if(br.hasErrors())
		{
			return "FirstPage";
		}
		else
		{
			model.addAttribute("name",user.getName());
			model.addAttribute("age",user.getAge());
			model.addAttribute("email",user.getEmail());
			model.addAttribute("phoneno",user.getPhoneNo());
			model.addAttribute("password",user.getPassword());
			model.addAttribute("city",user.getCities());
			model.addAttribute("coursecode",user.getCoursecode());
			
			return "secondpage";
		}
		
	}
}
