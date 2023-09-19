package com.myrdtest.springapi.services;

import com.myrdtest.springapi.models.User;
import org.springframework.stereotype.Service;

@Service
public interface IUserService {
	public String register(User user);
	public User find(int userId);
}
