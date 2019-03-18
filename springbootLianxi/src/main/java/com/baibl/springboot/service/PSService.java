package com.baibl.springboot.service;

import java.util.List;

import com.baibl.springboot.pojo.PS;

public interface PSService {
	
	PS getPS(Long id);
	
	int insertPS(PS ps);
	
	List<PS> checkPS(String str);
}
