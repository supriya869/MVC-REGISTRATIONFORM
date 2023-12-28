package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.model.User;
@Controller
public class userController {
	@RequestMapping("/req1")
	public String userForm(ModelMap model)
	{
		User user=new User();
		model.put("user",user);
		return "reg";
	}
	@RequestMapping("/request")
	public String regForm(@ModelAttribute User user,ModelMap model)
	{
		model.put("users", user);
		return "result";
	}

}
