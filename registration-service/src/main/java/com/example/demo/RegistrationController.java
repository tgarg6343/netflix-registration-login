package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {
	
	@Autowired
	private UserRegisterService userRegisterService;
	
	@Autowired
	private UserDetailsRepo userDetailsRepo;
	
	@PostMapping("/register")
	public User registerUser(@RequestBody User user) {
		
		String username=user.getUsername();
		Optional<User> findById = userDetailsRepo.findById(username);
		if(findById.isPresent()) {
			throw new UserAlreadyExist("UserName :"+username);
		}
		userDetailsRepo.save(user);
		return user;	
	}
	@GetMapping("/users")
	public List<User> retreiveUsers(){
		return  userDetailsRepo.findAll();
	}
}
