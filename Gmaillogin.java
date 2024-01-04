package com.testNg;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Gmaillogin {
	private WebDriver driver;
	  @BeforeTest
	  public void setUp() {
		  System.setProperty("webdriver.chrome.driver", "C:\\AUTOMATION TOOLS\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
	  }
  @Test
  public void loginingmail() throws InterruptedException {
	  driver.get("https://accounts.google.com/InteractiveLogin/signinchooser?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&ifkv=ASKXGp32WiM_SBJBPpRTNpACFGwdt1szksqASjgHpn53wuK6xPzduDacM8FZQuPZtwJMlfAV3vMWhQ&theme=glif&flowName=GlifWebSignIn&flowEntry=ServiceLogin/");
		Thread.sleep(2000);
		driver.findElement(By.name("identifier")).sendKeys("janki17soni@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		Thread.sleep(2000);	
		driver.findElement(By.name("password")).sendKeys("J@nki09soni");	
		Thread.sleep(2000);
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		Thread.sleep(2000);	
  }	

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
