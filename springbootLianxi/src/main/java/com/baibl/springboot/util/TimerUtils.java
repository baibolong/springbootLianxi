package com.baibl.springboot.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerUtils {
	

	
	public static void check(Date date){
		
		//执行周期(1天)
//		long daySpan = 24*60*60*1000;
		//测试时间为10秒
		long daySpan = 10000;
		
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd HH:mm:ss");

		try {
			//启动时间
			Date startTime = sdf.parse(sdf.format(date));
			
			//判断今天是否已经过了首次运行时间，如果已过，就明天执行
			if (System.currentTimeMillis() > startTime.getTime()) {
				startTime = new Date(startTime.getTime() + daySpan);
			} 
			
			Timer timer = new Timer();
		
			TimerTask timerTask = new TimerTask() {

				@Override
				public void run() {
					//定时检查
					System.out.println("定时器执行");
				}
			};
		
			//在每天的指定时间执行一次
			timer.schedule(timerTask, startTime, daySpan);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
