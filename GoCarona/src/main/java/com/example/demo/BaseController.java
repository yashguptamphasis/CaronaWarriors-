package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseController {
	
	@RequestMapping(value = "/")
	public String home()
	{
		System.out.println("Reached");
		return "/views/home.jsp";
	}
	

	
	@RequestMapping(value = "/helper")
	public String helper()
	{
		System.out.println("helper calling");
		return "/views/helper.jsp";
	}
}
