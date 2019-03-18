package com.baibl.springboot.pojo;

import org.apache.ibatis.type.Alias;

@Alias(value = "ps") //MyBatis指定别名
public class PS {

	private Long id;
	
	private String PSName;
	
	private String note;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPSName() {
		return PSName;
	}

	public void setPSName(String pSName) {
		PSName = pSName;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	
}
