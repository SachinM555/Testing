package com.org.pages;

import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;		
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.AfterTest;	

public class Login {	
	
	    private WebDriver driver;	
	    
		@Test				
		public void testEasy() {	
			 driver = new FirefoxDriver();  
			driver.get("http://www.guru99.com/selenium-tutorial.html");  
			String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("Free Selenium Tutorials")); 	
			
		}	
			
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}		
}	