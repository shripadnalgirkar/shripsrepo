package com.infy.common.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.infy.spring.dao.InsertDAO;
import com.infy.spring.model.Shop;

@Controller
public class JSONController {
	
	@Autowired
	InsertDAO insertDAO;

	@RequestMapping(value = "/shop/get/{name}", method = RequestMethod.GET)
	public @ResponseBody
	Shop getShopInJSON(@PathVariable String name) {
		
		Shop shop = new Shop();		
		if(name == null || name.trim().equals("") ){
			System.out.println(" warning----name is emty");			
			shop.setName("Empty !!!");
			return shop;
		}
		
		return insertDAO.getShop(name);
		

	}
	
	@RequestMapping(value = "/shop/insert/{name}", method = RequestMethod.GET)
	public @ResponseBody
	Shop getShopInsert(@PathVariable String name) {
		
		Shop shop = new Shop();		
		if(name == null || name.trim().equals("") ){
			System.out.println(" warning----name is emty");			
			shop.setName("Empty Insert!!!");
			return shop;
		}
		shop.setName(name);
		shop.setStaffName(new String[] { "suprakash", "1234" });
		insertDAO.insertShop(shop);
		return shop;

	}
	
	

}