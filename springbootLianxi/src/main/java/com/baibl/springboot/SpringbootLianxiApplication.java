package com.baibl.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
//定义Spring Boot 扫描包路径
@SpringBootApplication(scanBasePackages = {"com.baibl.springboot"})
//定义JPA接口扫描包路径
@EnableJpaRepositories(basePackages = "com.baibl.springboot.dao")
//定义实体Bean扫描包路径
@EntityScan(basePackages = "com.baibl.springboot.pojo")
//定义MyBatis的扫描
@MapperScan(
		//指定扫描包
		basePackages="com.baibl.springboot.*",
		annotationClass = Repository.class)
public class SpringbootLianxiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootLianxiApplication.class, args);
	}

}
