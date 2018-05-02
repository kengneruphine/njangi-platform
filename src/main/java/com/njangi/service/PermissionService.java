package com.njangi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.njangi.model.Member;
import com.njangi.model.Permission;
import com.njangi.repository.PermissionRepository;

@Service
public class PermissionService {
	
	@Autowired
	private PermissionRepository permissionRepository;
	
	public List<Permission> getAllPermissions(){
		List<Permission> permissions =new ArrayList<>();
		permissionRepository.findAll().forEach(permissions::add);
		return permissions;
	}
	
   public Permission getPermission(Integer id) {
     return permissionRepository.findOne(id);
   }

 public void addPermission(Permission permission) {
	permissionRepository.save(permission);
	}

public void updatePermission(Integer id,Permission permission) {
	permissionRepository.save(permission);
}

public void deletePermission(Integer id) {
	permissionRepository.delete(id);
}	

}
