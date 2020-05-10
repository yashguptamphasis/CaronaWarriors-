package com.example.demo.dao;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import com.example.demo.bean.Helper;

@Repository
public class Dao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public int saveHelper(Helper h)
	{
		return jdbcTemplate.update("insert into helper values('"+h.getName()+"','"+h.getEmail()+"','"+h.getPhone()+"','"+h.getCity()+"','"+h.getHelp()+"','"+h.getDescription()+"')");
	}

	
	public List<Helper> getHelper()
	{
		return jdbcTemplate.query("select * from helper", new BeanPropertyRowMapper(Helper.class));
	}
}

