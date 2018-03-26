package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserRegisterService {

	private static List<User> users=new ArrayList<User>();
	
	private String username;
	private String firstname;
	private String lastname;
	private int age;
	private String mobile;
	static {
		users.add(new User("tarun", "tarun","garg",21,"67347489"));
		users.add(new User("tarun_g", "tarun","garg",21,"6734748469"));
		users.add(new User("tarun_m", "tarun","garg",21,"6734748963573"));
	}
	
	public User save(User user) {
		if(user.getUsername()!=null) {
			users.add(user);
		}
		return user;
		
	}
	
	public List<User> getAllUsers() {
		
		return users;
		
	}
}
