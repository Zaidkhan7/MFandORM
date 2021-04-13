package com.ncu.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ncu.models.Users;

@Controller
public class WelcomeController {

	@RequestMapping("/hello")
	public String welcomemsg(Model model,@ModelAttribute("user") Users user) {
		model.addAttribute("msg",new Users());
		return "welcome";
	}
//	@RequestMapping(path = "/login",method = RequestMethod.POST)
//	public String doLogin(@RequestParam("userId") String user, @RequestParam("pwd") String password , Model model) {
//		String userId=user;
//		String pass = password;
//		if(userId.equals(pass))
//		{
//			model.addAttribute("welcome"+userId);
//		}
//		
//		else
//		{
//			model.addAttribute("msg" , "Username and password are not same");
//		}
//		return "login";
//	}
	@RequestMapping(path = "/login",method = RequestMethod.POST)
	public String HelloLogin(@ModelAttribute("user") Users user , Model model) {
		
		if(user.getUserId().equals(user.getPwd()))
		{
			model.addAttribute("msg",user.getUserId());
		}
		else
		{
			model.addAttribute("msg","Username and password don't match");
		}
		return "Lastpage";
	}
}