package com.iqmsoft.spring.velocity.service;

import java.util.List;

import com.iqmsoft.spring.velocity.model.User;

public interface UserService {

	public void addUser(User u);
	public void updateUser(User u);
	public List<User> listUsers();
	public User getUserById(int id);
	public void removeUser(int id);
	public List<User> listUsersByTeamName(String teamName);
	public User getUserByName(String userName);
	
} 