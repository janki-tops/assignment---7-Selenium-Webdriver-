import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class xpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\AUTOMATION TOOLS\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com//");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String data=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img")).getText();
		
		System.out.println(data);
		Thread.sleep(10000);
		driver.close();
								
       }

}
