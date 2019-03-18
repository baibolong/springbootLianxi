package com.baibl.springboot.service;

import java.util.Map;

import com.baibl.springboot.pojo.PS;

public interface PSService {
	
	PS getPS(Long id);
	
	int insertPS(PS ps);
	
	Map<String,Object> checkPS(PS ps);
}
