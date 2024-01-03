import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class registeringmail {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\AUTOMATION TOOLS\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/InteractiveLogin/signinchooser?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Ftab%3Drm%26ogbl&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Ftab%3Drm%26ogbl&osid=1&passive=1209600&service=mail&ifkv=ASKXGp1sX3Xi2t-nZjvibrS7Uw1No2OXfqhg5x11knnJRez5FFAa1-zQtizsal00d6_ZHQjvahCt&theme=glif&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.className("BHzsHc")).click();
		Thread.sleep(2000);	
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		Thread.sleep(2000);	
		driver.findElement(By.className("VfPpkd-StrnGf-rymPhb-b9t22c")).click();
		Thread.sleep(2000);	
		
		driver.findElement(By.name("firstName")).sendKeys("Janki");
		Thread.sleep(2000);
		driver.findElement(By.name("lastName")).sendKeys("Soni");
		Thread.sleep(2000);
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
Thread.sleep(2000);	
		
		Select month=new Select(driver.findElement(By.id("month")));
		month.selectByValue("October");
		Thread.sleep(2000);
		driver.findElement(By.name("day")).sendKeys("09");
		Thread.sleep(2000);
		driver.findElement(By.name("year")).sendKeys("1989");
		Thread.sleep(2000);
		Select gender=new Select(driver.findElement(By.id("gender")));
		gender.selectByValue("Female");
		Thread.sleep(2000);
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		Thread.sleep(2000);	
	//	driver.get("https://accounts.google.com/signup/v2/createusername?TL=AHNYTISXbrUUfUQN4MChgLESETkrO6S4KyYsBwvJK-hlgej94L7Ki3e9bsV8ORLb&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&dsh=S-553159218%3A1703265585495435&flowEntry=SignUp&flowName=GlifWebSignIn&hl=en&ltmpl=default&service=mail&theme=glif");
		driver.findElement(By.name("Username")).sendKeys("jankisoni822");
		Thread.sleep(2000);	
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();		
		
		driver.findElement(By.name("Passwd")).sendKeys("aBcdef@1234");
		Thread.sleep(2000);
		driver.findElement(By.name("PasswdAgain")).sendKeys("aBcdef@1234");
		Thread.sleep(2000);	
		WebElement c1=driver.findElement(By.className("VfPpkd-muHVFf-bMcfAe"));
		Thread.sleep(2000);
		c1.click();		
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		Thread.sleep(2000);
		
		Select country=new Select(driver.findElement(By.className("Fy0Xbe")));
		country.selectByValue("in");
		Thread.sleep(2000);
		driver.findElement(By.id("phoneNumberId")).sendKeys("8238780006");
		Thread.sleep(2000);
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("whsOnd zHQkBf")).sendKeys("688738");
		Thread.sleep(2000);
		
		driver.findElement(By.className("VfPpkd-RLmnJb")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("recovery")).sendKeys("8238780006");
		Thread.sleep(2000);
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("phoneNumberId")).sendKeys("8238780006");
		Thread.sleep(2000);
		driver.findElement(By.className("VfPpkd-RLmnJb")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("VfPpkd-RLmnJb")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		Thread.sleep(2000);
		WebElement c2=driver.findElement(By.className("VfPpkd-muHVFf-bMcfAe"));
		Thread.sleep(2000);
		c2.click();
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		Thread.sleep(2000);
		
		
		driver.close();	
	}
}

