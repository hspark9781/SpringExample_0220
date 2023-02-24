package com.hsp.spring.ex.mybatis.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.hsp.spring.ex.mybatis.model.Review;

@Repository
public interface ReviewDAO {

	public Review selectReview(@Param("id") int id); 
	
	public int insertReview( // insert update delete int로
			@Param("storeId") int storeId
			, @Param("menu") String menu
			, @Param("userName") String userName
			, @Param("point") double point
			, @Param("review") String review);
	
	public int insertReviewByObject(Review review);
	
}
