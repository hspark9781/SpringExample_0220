package com.hsp.spring.ex.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hsp.spring.ex.mybatis.bo.ReviewBO;
import com.hsp.spring.ex.mybatis.model.Review;

@Controller
public class ReviewController {

	@Autowired
	private ReviewBO reviewBO;
	
	// 전달받은 id와 일치하는 데이터 조회 후 그 결과를 json으로 response에 담기
	@RequestMapping("/mybatis/ex01")
	@ResponseBody
	public Review review(
			@RequestParam("id")int id
//			@RequestParam(value="id", required=false) int id // false 비필수 파라미터
//			@RequestParam(value="id", defaultValue="3") int id // id파라미터가 없으면 defaultValue 값으로
			) {
		
//		int id = Integer.parseInt(request.getParameter("id")); == @RequestParam("id")
		Review review = reviewBO.getRview(id);
		
		return review;
	}
	
}
