package com.baibl.springboot.service;

import java.util.List;

import com.baibl.springboot.pojo.User;

public interface UserService {
	
	List<User> findUsers(String userName, String note);

}
