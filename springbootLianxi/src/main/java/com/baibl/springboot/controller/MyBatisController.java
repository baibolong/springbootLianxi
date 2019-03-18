package com.baibl.springboot.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baibl.springboot.pojo.PS;
import com.baibl.springboot.service.PSService;

@Controller
@RequestMapping("/mybatis")
public class MyBatisController {
	
	@Autowired
	private PSService psService;
	
	@RequestMapping("/getPS")
	@ResponseBody
	public PS getPS(Long id) {
		PS ps = psService.getPS(id);
		return ps;
	}
	
	@RequestMapping("/insertUser")
	@ResponseBody
	public Map<String, Object> insertUser(String PSName,String note){
		PS ps = new PS();
		ps.setPSName(PSName);
		ps.setNote(note);
		
		int update = psService.insertPS(ps);
		
		Map<String, Object> result = new HashMap<>();
		result.put("success", update == 1);
		result.put("PS", ps);
		
		return result;
	}
	
}
