package com.Junit;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginprocessfacebook {
	private static ChromeDriver driver;
	private final String Facebook_URL="https://www.facebook.com/" ;

 @Before
 public void setup(){
     System.setProperty("webdriver.chrome.driver","C:\\AUTOMATION TOOLS\\chromedriver.exe");
     driver =new ChromeDriver();  
	} 

 @Test
 public void testFacebooklogin() throws InterruptedException{ 
	 driver.get(Facebook_URL);
	 driver.manage().window().maximize();
	 driver.findElement(By.id("email")).sendKeys("janki_soni1712@yahoo.com");
	 Thread.sleep(2000);
	 driver.findElement(By.id("pass")).sendKeys("J@nki10soni");
	 Thread.sleep(2000);
	 driver.findElement(By.name("login")).click();
	 assertTrue(driver.findElement(By.xpath("//*[@id=\"mount_0_0_1l\"]/div/div[1]/div/div[2]/div[5]/div[2]/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div/div[1]/div[2]/div/div[5]/div/div[1]/div[2]/div/div/div/div/span")).isDisplayed());
	  
 }
 @After
 public void driverclose() {
	if (driver!=null) {
	 driver.close();
	}
 } 

}
