package com.myrdtest.springapi.services;

import com.myrdtest.springapi.models.User;
import com.myrdtest.springapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;

@Component
public class UserService implements IUserService {
	@Autowired
	UserRepository userRepository;

//	@Autowired
//	public UserService(UserRepository userRepository) {
//		this.userRepository = userRepository;
//	}
	@Override
	public String register(User user) {
		try{
			Period period = Period.between(user.getBirthday(), LocalDate.now());
			if(period.getYears() >= 18){

				userRepository.save(user);

				return "SAVED";
			}else{

				return "NOT ALLOWED - UNDERAGE";
			}
		}catch(Exception e){
			return "NOT_SAVED - ERROr";
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
