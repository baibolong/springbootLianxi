package com.baibl.springboot.controller;

import java.util.HashMap;
import java.util.List;
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
	
	/**
	 * 获取PS
	 * @param id
	 * @return
	 */
	@RequestMapping("/getPS")
	@ResponseBody
	public PS getPS(Long id) {
		PS ps = psService.getPS(id);
		return ps;
	}
	
	/**
	 * 新增PS
	 * @param PSName
	 * @param note
	 * @return
	 */
	@RequestMapping("/insertPS")
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
	
	/**
	 * 定时检查note中是否包含指定字符
	 * @param note
	 * @return
	 */
	@RequestMapping("/checkPS")
	@ResponseBody
	public List<PS> checkPS(String str){
		
		
		List<PS> list = psService.checkPS(str);
		
		return list;
	}
	
}
