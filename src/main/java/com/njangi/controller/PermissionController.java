package com.njangi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.njangi.model.Member;
import com.njangi.model.Permission;
import com.njangi.service.MemberService;
import com.njangi.service.PermissionService;

@RestController
public class PermissionController {
	
	@Autowired
	private PermissionService permissionService;
	
	@RequestMapping("/permissions")
	public List<Permission> getAllPermissions(){
		return permissionService.getAllPermissions();
	}
	
	@RequestMapping("/permissions/{id}")
	public 	Permission getPermission(@PathVariable Integer id) {
		return permissionService.getPermission(id);
		}

	@RequestMapping(method=RequestMethod.POST, value="/permissions")
	public void addPermission(@RequestBody Permission permission) {
		permissionService.addPermission(permission);
		}
	
	@RequestMapping(method=RequestMethod.PUT, value="/permissions/{id}")
	public void updatePermission(@RequestBody Permission permission, @PathVariable Integer id) {
		permissionService.updatePermission(id,permission);
		}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/permissions/{id}")
	public 	void deletePermission(@PathVariable Integer id) {
		permissionService.deletePermission(id);
		}
		

}
