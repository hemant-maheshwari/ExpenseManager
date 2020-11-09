package com.expensemanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expensemanager.model.Account;
import com.expensemanager.repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
	AccountRepository accountRepository;
	
	public Account create(Account account) {
		return accountRepository.save(account);
	}
	
}
