package com.infy.spring.dao;

import org.springframework.stereotype.Service;

import com.infy.spring.model.Shop;

@Service("insertDAO")
public class InsertDAOImpl implements InsertDAO{

	@Override
	public void insertShop(Shop shop) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Shop getShop(String name) {
		
		Shop shop = new Shop();
		shop.setName(name);
		shop.setId("Shop 1");
		shop.setStaffName(new String[] { "suprakash", "1234" });
		return shop;
	}

}
