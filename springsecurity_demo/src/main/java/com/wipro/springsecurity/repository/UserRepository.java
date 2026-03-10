package com.wipro.springsecurity.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.springsecurity.entity.UserEntity;

public interface UserRepository  extends JpaRepository<UserEntity,Long> {
	
	// select * from User_Accounts where username = ?;
				public  UserEntity    findByUserName(String username);

}
