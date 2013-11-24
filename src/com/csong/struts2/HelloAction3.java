package com.csong.struts2;

import com.csong.struts2.model.User;
import com.opensymphony.xwork2.ActionSupport;

public class HelloAction3 extends ActionSupport {
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
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
