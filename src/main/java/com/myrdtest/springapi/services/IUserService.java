package com.myrdtest.springapi.services;

import com.myrdtest.springapi.models.User;

public interface IUserService {
	public String register(User user);
	public User find(int userId);
}
