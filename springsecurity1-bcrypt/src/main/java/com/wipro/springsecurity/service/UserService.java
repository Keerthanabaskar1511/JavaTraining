package com.wipro.springsecurity.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.wipro.springsecurity.entity.UserInfo;
import com.wipro.springsecurity.repository.UserInfoRepository;

@Service
public class UserService {
	
	@Autowired
    private UserInfoRepository repository;

    @Autowired
    private PasswordEncoder passwordEncoder;
	
	
	public String addUser(UserInfo userInfo) {  // user registration
        userInfo.setPassword(passwordEncoder.encode(userInfo.getPassword()));
        repository.save(userInfo);
        return "user added to system ";
    }

}