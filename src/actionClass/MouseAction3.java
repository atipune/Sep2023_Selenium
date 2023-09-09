package actionClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction3 {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		List<WebElement> categoryList = driver.findElements(By.xpath("//div[@id='nav-xshop']/a"));
		Actions act=new Actions(driver);
		for(WebElement category:categoryList)
		{
			act.moveToElement(category).perform();
			Thread.sleep(2000);
		}
	}
}
