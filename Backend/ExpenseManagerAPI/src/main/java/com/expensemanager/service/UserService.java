package com.expensemanager.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.expensemanager.model.User;
import com.expensemanager.repository.UserRepository;

public class UserService {

	@Autowired
	UserRepository userRepository;
	
	public User create(User user) {
		return userRepository.save(user);
	}
	
	public User find(User user) {
		//STORE PROCEDURE TO FIND ID OF THE USER USING USERNAME AND PASSWORD
		int id = 0;
		return findByID(id);
	}
	
	public User find(String email) {
		//STORE PROCEDURE TO FIND ID OF THE USER USING EMAIL
		int id = 0;
		return findByID(id);
	}
	
	public void update(User user) {
		userRepository.save(user);
	}
	
	private User findByID(Integer userId) {
		return userRepository.findById(userId).get(); 
	}
	
	
}
