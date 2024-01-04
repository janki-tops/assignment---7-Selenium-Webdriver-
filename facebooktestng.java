package com.testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class facebooktestng {
  private WebDriver driver;
  @BeforeClass
  public void setUp() {
	  System.setProperty("webdriver.chrome.driver", "C:\\AUTOMATION TOOLS\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }
	@Test
	@Parameters({"username", "password"})
  public void logintofacebook() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("janki17soni@gmail.com");	
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("J@nki09soni");	
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		Assert.assertTrue(driver.getCurrentUrl().contains("facebook.com"));
  }
	@AfterClass
	public void closebrowser() {
		driver.close();
	}
}
