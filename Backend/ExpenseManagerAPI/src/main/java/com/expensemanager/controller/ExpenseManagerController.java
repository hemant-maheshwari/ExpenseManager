package com.expensemanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.expensemanager.model.Account;
import com.expensemanager.model.User;
import com.expensemanager.service.AccountService;
import com.expensemanager.service.UserService;

@RestController
@CrossOrigin("*")
public class ExpenseManagerController {

	@Autowired
	UserService userService;
	
	@Autowired
	AccountService accountService;
	
	@PostMapping("api/v1/createAccount")
	public void createUserAccount(@RequestBody User user, @RequestBody Account account) {
		user = verifyUser(user);
		if(user.getId()!=0) {
			user = userService.create(user);
			account.setId(user.getId());
			accountService.create(account);
		}
	}
	
	@PostMapping("api/v1/verify")
	public User verifyUser(@RequestBody User user) {
		return userService.find(user);
	}
	
	@PostMapping("api/v1/forgot")
	public User forgotPassword(@RequestBody String email) {
		return userService.find(email);
	}
	
	@PostMapping("api/v1/updatePassword")
	public void updatePassword(@RequestBody User user) {
		userService.update(user);
	}
	
	
}
