package com.baibl.springboot.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.baibl.springboot.dao.MyBatisPSDao;
import com.baibl.springboot.pojo.PS;
import com.baibl.springboot.service.PSService;
@Service
public class PSServiceImpl implements PSService {
	
	@Autowired
	private MyBatisPSDao myBatisPSDao;

	@Override
	@Transactional(isolation = Isolation.READ_COMMITTED,timeout = 1)
	public PS getPS(Long id) {
		return myBatisPSDao.getPS(id);
	}

	@Override
	@Transactional(isolation = Isolation.READ_COMMITTED,timeout = 1)
	public int insertPS(PS ps) {
		return myBatisPSDao.insertPS(ps);
	}

	@Override
	public Map<String, Object> checkPS(PS ps) {
		String note = ps.getNote();
		
		return null;
	}


}
