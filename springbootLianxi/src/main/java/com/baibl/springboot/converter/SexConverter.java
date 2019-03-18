package com.baibl.springboot.converter;

import javax.persistence.AttributeConverter;

public class SexConverter implements AttributeConverter<Long, Integer>{
	
	//将Long装换为数据库列Integer
	@Override
	public Integer convertToDatabaseColumn(Long attribute) {
		return attribute.intValue();
	}
	
	//将数据库列装换为Long
	@Override
	public Long convertToEntityAttribute(Integer dbData) {
		// TODO Auto-generated method stub
		return dbData.longValue();
	}

}
