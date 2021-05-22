package com.ncu.models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;


import com.ncu.validation.IsValidPass;

public class Users {
	
	@NotNull()
	private String Name;
	
	@Pattern(regexp= "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message="Enter valid email")
	private String Email;
	
	@NotNull(message="Age is a required field")
	private int Age;
	
	@Pattern(regexp="[0-9]{10}",message="Please Enter a 10 digit Phone Number")
	private String PhoneNo;
	@IsValidPass(message="Password pattern not satisfied")
	@NotNull(message="Password field can't be empty")
	private String Password;
	
	private String Cities;
	
	@NotNull(message="Gender is a required field")
	private String Gender;
		
	
	private String Coursecode;
	
	
	
	public String getCoursecode() {
		return Coursecode;
	}

	public void setCoursecode(String coursecode) {
		Coursecode = coursecode;
	}

	public String getGender() {	
		return Gender;
	}
	
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getCities() {
		return Cities;
	}
	public void setCities(String cities) {
		Cities = cities;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getPhoneNo() {
		return PhoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		PhoneNo = phoneNo;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}

}

