package com.inetBanking.testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetBanking.utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig readconfig = new ReadConfig();
	
	public String baseURL=readconfig.getApplicationURL();
	public String username=readconfig.getUsername();
	public String password=readconfig.getPassword();
	public static WebDriver driver;
	
	
	@Parameters("browser")
	@BeforeClass
	public void setUp(String br)
	{
		if(br.equals("chrome")) 
		{	
			System.setProperty("webdriver.chrome.driver",readconfig.getChromepath());
			driver=new ChromeDriver();	
		}
		else if (br.equals("firefox"))
		{
			//System.setProperty("WebDriver.gecko.driver", readconfig.getFirefoxPath());
			driver = new FirefoxDriver();
		}
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	

}
