package com.baibl.springboot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.baibl.springboot.pojo.User;

public interface JpaUserRepository extends JpaRepository<User, Long> {
	
	//使用JPA查询语言（JPQL）
	@Query("from user where user_name like contat('%', ?1, '%') "
			+ "and note like concat('', ?2, '%') ")
	List<User> findUsers(String userName, String note);
	
	
	//JPA的命名查询
	/**
	 * 按用户名称模糊查询
	 * @param userName 用户名
	 * @return 用户列表
	 */
	List<User> findByUserNameLike(String userName);
	
	/**
	 * 根据主键查询
	 * @param id 主键
	 * @return 用户
	 */
	User findUserById(Long id);
	
	/**
	 * 按照用户名称或者备注进行模糊查询
	 * @param userName 用户名
	 * @param note 备注
	 * @return 用户列表
	 */
	List<User> findByUserNameLikeOrNoteLike(String userName, String note);
}
