package com.baibl.springboot.pojo;


import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.baibl.springboot.converter.SexConverter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity(name="user")
@Table(name ="t_user")
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler"})
public class User {
	
	//表明主键
	@Id
	//主键策略，递增
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id = null;
	
	//定义属性和表的映射关系
	@Column(name = "user_name")
	private String userName = null;
	
	@Convert(converter = SexConverter.class)
	private Long sex = null;
	private String note = null;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Long getSex() {
		return sex;
	}
	public void setSex(Long sex) {
		this.sex = sex;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	
	
}
