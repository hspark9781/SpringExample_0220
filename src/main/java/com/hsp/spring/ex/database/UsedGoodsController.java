package com.hsp.spring.ex.database;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hsp.spring.ex.database.bo.UsedGoodsBo;
import com.hsp.spring.ex.database.model.UsedGoods;

@Controller
public class UsedGoodsController {

	@Autowired
	private UsedGoodsBo usedGoodsBO;
	
	@RequestMapping("/database/ex01")
	@ResponseBody
	public List<UsedGoods> ex01() {
		// used_goods목록 가져오기
		List<UsedGoods> usedGoodsList = usedGoodsBO.getUsedGoodsList();
		
		return usedGoodsList;
		
	}
}
