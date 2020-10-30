package com.expensemanager.repository;

import org.springframework.data.repository.CrudRepository;

import com.expensemanager.model.Account;

public interface AccountRepository extends CrudRepository<Account, Integer>{

}
