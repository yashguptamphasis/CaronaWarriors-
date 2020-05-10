package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.bean.Helper;
import com.example.demo.dao.Dao;

@Controller
public class ReceiverController {

	@Autowired
	Dao dao;
	
	@RequestMapping(value = "receiver")
	public String receiver(ModelMap model)
	{
		List<Helper> list=dao.getHelper();
		model.put("helper", list);
		return "/views/receiver.jsp";
	}
}
