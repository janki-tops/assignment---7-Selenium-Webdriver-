package com.testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class facebook_parameter {
	 private WebDriver driver;
	  @BeforeClass
	  public void setUp() {
		  System.setProperty("webdriver.chrome.driver", "C:\\AUTOMATION TOOLS\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
	  }
	  @DataProvider(name = "loginData")
	  public Object[][]loginData(){
		return new Object[][] {
			{"username1", "password1"},{"username2", "password2"}
		};
	  		  
	  }
	  @Test(dataProvider="loginData")
	  public void testLogin(String username, String password) throws InterruptedException {
		  driver.get("https://www.facebook.com/");
			Thread.sleep(2000);
			driver.findElement(By.id("email")).sendKeys(username);	
			Thread.sleep(2000);
			driver.findElement(By.id("pass")).sendKeys(password);	
			Thread.sleep(2000);
			driver.findElement(By.name("login")).click();
			Thread.sleep(2000);
	  }
	  @AfterClass
		public void closebrowser() {
			driver.close();
		}
}
