package com.baibl.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baibl.springboot.dao.JpaUserRepository;
import com.baibl.springboot.pojo.User;

@Controller
@RequestMapping("/jpa")
public class JpaController {
	
	@Autowired
	private JpaUserRepository jpaUserRepository = null;
	
	@RequestMapping("/getUser")
	@ResponseBody
	public User getUser(Long id) {

		//使用JPA接口查询对象
		User user = jpaUserRepository.getOne(id);
		System.out.println(user);
		return user;
	}
	
	@RequestMapping("/getUserById")
	@ResponseBody
	public User getUserById(Long id) {
		//使用JPA接口查询对象
		User user = jpaUserRepository.findUserById(id);
		return user;
	}
	
	@RequestMapping("/getByUserNameLike")
	@ResponseBody
	public List<User> getByUserNameLike(String userName){
		List<User> userList = jpaUserRepository.findByUserNameLike("%" + userName + "%");
		return userList;
	}
	
	@RequestMapping("/getByUserNameLikeOrNoteLike")
	@ResponseBody
	public List<User> getByUserNameLikeOrNoteLike(String userName,String note){
		List<User> userList = jpaUserRepository.findByUserNameLikeOrNoteLike(userName, note);
		return userList;
	}
	
}
