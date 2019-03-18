package com.baibl.springboot.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.baibl.springboot.pojo.PS;

@Repository
public interface MyBatisPSDao {

	PS getPS(Long id);
	
	int insertPS(PS ps);
	
	List<PS> checkPS(String str);
}
