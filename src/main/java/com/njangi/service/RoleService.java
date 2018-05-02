package com.njangi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.njangi.model.Member;
import com.njangi.model.Role;
import com.njangi.repository.MemberRepository;
import com.njangi.repository.RoleRepository;

@Service
public class RoleService {
	@Autowired
	private RoleRepository roleRepository;
	
	
	public List<Role> getAllRoles(){
		List<Role> roles =new ArrayList<>();
		roleRepository.findAll().forEach(roles::add);
		return roles;
	}
	
   public Role getRole(Integer id) {
   return roleRepository.findOne(id);
   }

 public void addRole(Role role) {
	 roleRepository.save(role);
	}

public void updateRole(Integer id,Role role) {
	roleRepository.save(role);
}

public void deleteRole(Integer id) {
	roleRepository.delete(id);
}	

}
