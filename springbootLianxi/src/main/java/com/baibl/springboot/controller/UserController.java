package com.baibl.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.baibl.springboot.pojo.User;
import com.baibl.springboot.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService = null;
	
	@RequestMapping("/table")
	public ModelAndView table() {
		//访问模型层得到数据
		List<User> userList = userService.findUsers(null, null);
		//创建模型和视图
		ModelAndView mv = new ModelAndView();
		//定义模型视图
		mv.setViewName("user/table");
		//加入数据模型
		mv.addObject("userList", userList);
		//返回模型和视图
		return mv;
	}
	
	@RequestMapping("/list")
	@ResponseBody
	public List<User> list(
			@RequestParam(value = "userName",required = false) String userName,
			@RequestParam(value = "note",required = false) String note){
		//访问模型层得到数据
		List<User> userList = userService.findUsers(userName, note);
		return userList;
	}
	
}
