package com.njangi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.njangi.model.Account;
import com.njangi.model.Member;
import com.njangi.service.AccountService;

@RestController
public class AccountController {
	
	@Autowired
	private AccountService accountService;
	
	@RequestMapping("/accounts")
	public List<Account> getAllAccounts(){
		return accountService.getAllAccounts();
	}
	
	@RequestMapping("/accounts/{id}")
	public 	Account getAccount(@PathVariable Integer id) {
		return accountService.getAccount(id);
		}

	@RequestMapping(method=RequestMethod.POST, value="/accounts")
	public void addAccount(@RequestBody Account account) {
		accountService.addAccount(account);
		}
	
	@RequestMapping(method=RequestMethod.PUT, value="/accounts/{id}")
	public void updateAccount(@RequestBody Account account, @PathVariable Integer id) {
		accountService.updateAccount(id,account);
		}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/accounts/{id}")
	public 	void deleteAccount(@PathVariable Integer id) {
		accountService.deleteAccount(id);
		}
		

}
