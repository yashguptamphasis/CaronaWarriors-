package com.example.demo.bean;

public class Helper {

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getHelp() {
		return help;
	}
	public void setHelp(String help) {
		this.help = help;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Helper() {}
	public Helper(String name, String email, String phone, String city, String help, String description) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.city = city;
		this.help = help;
		this.description = description;
	}
	 String name;
	 String email;
	 String phone;
	 String city;
	 String help;
	 String description;	
}
