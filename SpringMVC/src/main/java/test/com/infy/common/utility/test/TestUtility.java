package com.infy.common.utility.test;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.infy.common.utility.WebUtility;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"classpath*=test-context.xml"})
public class TestUtility {
	@Test
	public void testUtility(){
		new WebUtility().formatDate();
		Assert.assertEquals("1", "1");
	}
	
}
