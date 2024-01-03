import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\AUTOMATION TOOLS\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("firstName")).sendKeys("Janki");
		Thread.sleep(2000);
		driver.findElement(By.name("lastName")).sendKeys("Soni");
		Thread.sleep(2000);
		driver.findElement(By.name("phone")).sendKeys("8238780006");
		Thread.sleep(2000);
		driver.findElement(By.name("userName")).sendKeys("janki17soni@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("address1")).sendKeys("Dev Parijat");
		Thread.sleep(2000);
		driver.findElement(By.name("city")).sendKeys("Ahmedabad");
		Thread.sleep(2000);
		driver.findElement(By.name("state")).sendKeys("Gujarat");
		Thread.sleep(2000);
		driver.findElement(By.name("postalCode")).sendKeys("382421");
		Thread.sleep(2000);
		Select country=new Select(driver.findElement(By.name("country")));
		country.selectByValue("CANADA");
		Thread.sleep(2000);
		country.selectByVisibleText("GERMANY");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("janki17soni@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Janki@171217");
		Thread.sleep(2000);
		driver.findElement(By.name("confirmPassword")).sendKeys("Janki@171217");
		Thread.sleep(2000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);		
		driver.close();				
	}
}

