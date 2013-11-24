package com.csong.struts2;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction3 extends ActionSupport {
	public String execute() {
		System.out.println("hello action3");
		return "success";
	}

	public String add() {
		System.out.println("hello action3 add");
		return "success";
	}
}
