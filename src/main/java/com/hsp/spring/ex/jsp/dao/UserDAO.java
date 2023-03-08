package com.hsp.spring.ex.jsp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.hsp.spring.ex.jsp.model.User;

@Repository
public interface UserDAO {
	
	public int insertUser(
			@Param("name")String name
			, @Param("birthday")String birthday
			, @Param("email")String email
			, @Param("introduce")String introduce);

	public User selectLastUser();
	
	public int InsertUserByObject(User user);
	
	
	public List<User> selectUserList();
}


