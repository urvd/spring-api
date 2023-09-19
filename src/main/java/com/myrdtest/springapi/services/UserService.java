package com.myrdtest.springapi.services;

import com.myrdtest.springapi.models.User;
import com.myrdtest.springapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService{
	@Autowired
	UserRepository userRepository;
	@Override
	public String register(User user) {
		try{
			userRepository.save(user);
			return "SAVED";
		}catch(Exception e){
			return "NOT_SAVED";
		}
	}

	@Override
	public User find(int userId) {
		try{
			User user = userRepository.findById(Integer.valueOf(userId)).get();
			return user;
		}catch(Exception e){
			return null;
		}


	}
}
