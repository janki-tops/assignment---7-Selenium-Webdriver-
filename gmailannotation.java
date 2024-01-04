package com.Junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmailannotation {
	private static ChromeDriver driver;
	private final String gmail_URL="https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=ASKXGp0mgs9nXsu7zFAy3JVU4J3ot8b-D6Fs_lT7SL1dkBQKZYiKis9Ib-Es0-OikcsqAB4iJQMf&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S739116721%3A1703611611152259&theme=glif";
	@Before
	public void setup(){
	     System.setProperty("webdriver.chrome.driver","C:\\AUTOMATION TOOLS\\chromedriver.exe");
	     driver =new ChromeDriver();  
		} 

	 @Test
	 public void testgmaillogin() throws InterruptedException{ 
		 driver.get(gmail_URL);		 
		 driver.manage().window().maximize();
		 driver.findElement(By.name("identifier")).sendKeys("janki17soni@gmail.com");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.name("Passwd")).sendKeys("J@nki09soni");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span")).click();	 		  
	 }
	 @After
	 public void driverclose() {
		
		 driver.close();
		
	 } 


}
