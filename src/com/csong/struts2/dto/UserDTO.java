package com.csong.struts2.dto;

public class UserDTO {
	private String name;
	private Integer age;
	private String password;
	private String confirm;
	public String getName() {
		return name;
	}
	public Integer getAge() {
		return age;
	}
	public String getPassword() {
		return password;
	}
	public String getConfirm() {
		return confirm;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setConfirm(String confirm) {
		this.confirm = confirm;
	}


}
