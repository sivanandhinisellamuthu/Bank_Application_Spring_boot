package com.sjprogramming.bankapp.service;

import java.util.List;

import com.sjprogramming.bankapp.entity.Account;


//here i will describe all the methods i am going to implement
public interface AccountService {
	public Account createAccount(Account account);
	public Account getAccountDetailsByAccountNumber(Long accountNumber);
	public List<Account> getAllAccountDetails();
	public Account depositAmount(Long accountNumber,Double amount);
	public Account withdrawAmount(Long accountNumber,Double amount);
	public void closeAccount(Long accountNumber);
}
