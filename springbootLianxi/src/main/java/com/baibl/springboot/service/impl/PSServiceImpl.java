package com.baibl.springboot.service.impl;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

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
	public List<PS> checkPS(String str) {

        Timer timer = new Timer();  
        timer.schedule(new TimerTask() {  
        	
			public void run() {  
                System.out.println("-------设定要指定任务--------");  
                myBatisPSDao.checkPS(str);
            }  
        }, 10000);// 设定指定的时间time,此处为10000毫秒  
		
		
		
		return null;
	}




}
