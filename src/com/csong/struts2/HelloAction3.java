package com.csong.struts2;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction3 extends ActionSupport {
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	private Integer age;

	public String execute() {
		System.out.println("hello action3");
		return "success";
	}

	public String add() {
		System.out.println("age: " +  age);
		System.out.println("name: " +  name);
		return "success";
	}
}
