package com.wipro.springsecurity.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;

@Configuration
@EnableWebSecurity
public class AppSecurityConfig {
	
	@Autowired
	UserDetailsService userDetailsService;
	
	@Bean
	
	public UserDetailsService getUserDetailsService() {
		List<UserDetails> usersList=new ArrayList<UserDetails>();
		
		usersList.add(User.withDefaultPasswordEncoder().username("spiderman").
		password("web").roles("USER").build());
		
		usersList.add(User.withDefaultPasswordEncoder().username("Keerthana").
				password("tiger").roles("ADMIN").build());
		
		return new InMemoryUserDetailsManager(usersList);
		
	
		
	}

}
