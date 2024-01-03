import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class link_Partiallink {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\AUTOMATION TOOLS\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://thedemosite.co.uk/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement about=driver.findElement(By.linkText("About"));
		WebElement contact=driver.findElement(By.linkText("Contact"));
		Actions action=new Actions(driver);
		Action click_about=action.moveToElement(about).build();
		click_about.perform();
		Thread.sleep(2000);
		Action click_contact=action.moveToElement(contact).build();
		click_contact.perform();
		Thread.sleep(2000);		
		driver.close();
								
       }

}
