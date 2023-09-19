package com.myrdtest.springapi.contollers;

import com.myrdtest.springapi.models.User;
import com.myrdtest.springapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController("/api")
//@RequestMapping("/api")
public class UserController {

	@Autowired
	UserService userService;
	@PostMapping("/user")
	public String registerUser(@RequestBody User user){
		return userService.register(user);
	}
	@GetMapping("/user/{id}")
	public User selectUser(@PathVariable int id){
		return userService.find(id);
	}
}
