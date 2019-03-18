package com.baibl.springboot.service.impl;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.baibl.springboot.pojo.User;
import com.baibl.springboot.service.JdbcTmplUserService;

public class JdbcTmplUserServiceImpl implements JdbcTmplUserService {
	
	@Autowired
	private JdbcTemplate jdbcTemplate = null;
	
	//获取映射关系
	private RowMapper<User> getUserMapper(){
		//使用Lambda 表达式创建用户映射关系
		RowMapper<User> userRowMapper = (ResultSet rs, int rownum)->{
			User user = new User();
			user.setId(rs.getLong("id"));
			user.setUserName(rs.getString("user_name"));
			user.setSex(rs.getLong("sex"));
			user.setNote(rs.getString("note"));
			return user;
		};
		return userRowMapper;
	}
	
	//获取用户
	@Override
	public User getUser(Long id) {
		//执行sql
		String sql = "select id,user_name,sex,note from t_user where id =?";
		//参数
		Object[] params = new Object[] {id};
		User user = jdbcTemplate.queryForObject(sql, params, getUserMapper());
		return user;
	}

	@Override
	public List<User> findUsers(String userName, String note) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int UpdateUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteUser(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
