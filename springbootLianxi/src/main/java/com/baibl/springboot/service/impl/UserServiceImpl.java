package com.baibl.springboot.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.baibl.springboot.pojo.User;
import com.baibl.springboot.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	

	
	@Override
	public List<User> findUsers(String userName, String note) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> checkUser(User user) {
		
		return null;
	}

}
