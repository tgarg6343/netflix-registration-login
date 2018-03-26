package com.example.demo;

public class User {
	private String username;
	private String firstname;
	private String lastname;
	private int age;
	private String mobile;
	public User(String username, String firstname, String lastname, int age, String mobile) {
		super();
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.mobile = mobile;
	}
	public String getUsername() {
		return username;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public int getAge() {
		return age;
	}
	public String getMobile() {
		return mobile;
	}
	
}
