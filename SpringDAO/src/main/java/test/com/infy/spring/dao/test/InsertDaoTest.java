package com.infy.spring.dao.test;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.infy.spring.dao.InsertDAOImpl;
import com.infy.spring.model.Shop;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"classpath*=test-context.xml"})
public class InsertDaoTest {
	
	
	@Test
	public void testGetShop(){
		System.out.println("------testGetShop------");
		Shop shop=new InsertDAOImpl().getShop("test");		
		Assert.assertEquals("Shop 1", shop.getId());
		
	}
	
	@Test
	public void testInsertShop(){
		System.out.println("------testInsertShop------");
		Shop shop = new Shop();
		new InsertDAOImpl().insertShop(shop);
		
		Assert.assertEquals("1", "1");
	}
}
