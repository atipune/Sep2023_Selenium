package actionClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions2 {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://onlinesbi.sbi/");
		Thread.sleep(2000);
		WebElement Loans = driver.findElement(By.xpath("(//a[@class='has-submenu'])[11]"));
		Actions act = new Actions(driver);
		act.moveToElement(Loans).perform();
		List<WebElement> list = driver.findElements(By.xpath("//li[@class='dropdown open']//a"));
		for(WebElement option:list)
		{
			act.moveToElement(option).perform();
			Thread.sleep(2000);
		}
		Loans.click();
	}
}
