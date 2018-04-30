package com.njangi.repository;

import org.springframework.data.repository.CrudRepository;

import com.njangi.model.Member;

public interface MemberRepository extends CrudRepository<Member, String> {

	}

