package com.njangi.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	private static final String USER = "USER";
	private static final String ADMIN= "ADMIN";
	
	@Override
	public void configure(HttpSecurity httpSecurity)throws Exception{
		httpSecurity.authorizeRequests()
		.antMatchers("/user").hasRole(USER)
		.antMatchers("/admin").hasRole(ADMIN)
		.and()
		.formLogin();
	}
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth)throws Exception{
		auth.inMemoryAuthentication()
		.withUser("grace").password("password").roles(USER)
		.and()
		.withUser("ruphine").password("password").roles(USER,ADMIN);
		
	} 
	

}
