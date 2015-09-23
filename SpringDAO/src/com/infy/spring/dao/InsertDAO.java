package com.infy.spring.dao;

import com.infy.spring.model.Shop;

public interface InsertDAO {
	
	public void insertShop(Shop shop);
	public Shop getShop(String name);

}
