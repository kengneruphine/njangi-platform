package com.njangi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.njangi.model.Account;
import com.njangi.model.Member;
import com.njangi.repository.AccountRepository;

@Service
public class AccountService {
	
	@Autowired
	private AccountRepository accountRepository;
	
	public List<Account> getAllAccounts(){
		List<Account> accounts=new ArrayList<>();
		accountRepository.findAll().forEach(accounts::add);
		return accounts;
	}
	
   public Account getAccount(Integer id) {
   return accountRepository.findOne(id);
   }

 public void addAccount(Account account) {
	 accountRepository.save(account);
	}

public void updateAccount(Integer id,Account account) {
	accountRepository.save(account);
}

public void deleteAccount(Integer id) {
	accountRepository.delete(id);
}	


}
