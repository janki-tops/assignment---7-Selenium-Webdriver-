import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Mouse_Keybordevent {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\AUTOMATION TOOLS\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement home = driver.findElement(By.className("mouseOut"));

		Actions builder = new Actions(driver);
		Action seriesOfActions = builder.moveToElement(home).click().keyDown(home, Keys.SHIFT).sendKeys(home, "Home").keyUp(home, Keys.SHIFT).doubleClick(home).contextClick().build();
		Thread.sleep(1000);	
		seriesOfActions.perform() ;
		
		driver.close();				
	}
}

