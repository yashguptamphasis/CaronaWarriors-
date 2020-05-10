package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.bean.Helper;
import com.example.demo.dao.Dao;

@Controller
public class HelperController {

	@Autowired
	Dao hd;
	
	@RequestMapping(value="save")
	public String save(Helper helper,ModelMap model)
	{
		System.out.println("Reached save");
		System.out.println(helper.getName()+" /n"+helper.getDescription());
		hd.saveHelper(helper);
		return "views/home.jsp";
	}
	
	
	@RequestMapping(value="save1")
	public String save1()
	{
		System.out.println("Reached save");
		return "views/home.jsp";
	}
}
