package com.ust.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ust.entity.Users;
import com.ust.service.UserService;

@Controller
@RequestMapping("/users")

public class UserController {
	

	@Autowired
	private UserService userService;
	
	@PostMapping("/saveUser")
	public String saveUser(@ModelAttribute("users") Users theUser)
	{
		//save the customer 
		userService.saveUser(theUser);
		return "redirect:/users/list";
	}

	@GetMapping("/form")
	public String showFormForAdd(Model theModel)
	{
		//create a model atttribute to bind form data
		Users theUser = new Users();
		theModel.addAttribute("users", theUser);
		return "form";
		
	}

	
	@RequestMapping(path="/list",method=RequestMethod.GET)
	public String listUsers(Model theModel)
	{
		List<Users> theUsers = userService.getUsers();
		theModel.addAttribute("userss", theUsers);
		return "details";
	}
	

}
