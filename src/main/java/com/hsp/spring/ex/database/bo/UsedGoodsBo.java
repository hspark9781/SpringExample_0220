package com.hsp.spring.ex.database.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hsp.spring.ex.database.dao.UsedGoodsDAO;
import com.hsp.spring.ex.database.model.UsedGoods;

@Service
public class UsedGoodsBo {

	@Autowired
	private UsedGoodsDAO usedGoodsDAO;
	
	// used_goods 모든 데이터 조회 리턴 메소드
	public List<UsedGoods> getUsedGoodsList() {
		List<UsedGoods> usedGoodsList = usedGoodsDAO.selectUsedGoodsList();
		return usedGoodsList;
	}
}
