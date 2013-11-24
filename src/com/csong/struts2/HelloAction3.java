package com.csong.struts2;

import com.csong.struts2.dto.UserDTO;
import com.opensymphony.xwork2.ActionSupport;

public class HelloAction3 extends ActionSupport {
	private UserDTO user;

	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}

	public String execute() {
		System.out.println("hello action3");
		return "success";
	}

	public String add() {
		System.out.println("age: " +  user.getAge());
		System.out.println("name: " +  user.getName());
		return "success";
	}
}
