package com.inetBanking.testcases;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.inetBanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass 
{
	@Test
	public void loginTest()
	{
		driver.get(baseURL);
        
		LoginPage lp = new LoginPage(driver);
		
		lp.setUserName(username);
		
		lp.setPassword(password);
		
		lp.clickSubmit();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
}
