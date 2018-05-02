package com.njangi.repository;

import org.springframework.data.repository.CrudRepository;

import com.njangi.model.Account;

public interface AccountRepository extends CrudRepository<Account, Integer>{

}
