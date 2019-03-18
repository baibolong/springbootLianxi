package com.baibl.springboot.service;

import java.util.List;

import com.baibl.springboot.pojo.User;

public interface JdbcTmplUserService {
	
	User getUser(Long id);
	
	List<User> findUsers(String userName, String note);
	
	int insertUser(User user);
	
	int UpdateUser(User user);
	
	int deleteUser(Long id);
	
}
