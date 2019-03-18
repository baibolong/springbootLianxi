package com.baibl.springboot.service;

import com.baibl.springboot.pojo.PS;

public interface PSService {
	
	PS getPS(Long id);
	
	int insertPS(PS ps);
}
