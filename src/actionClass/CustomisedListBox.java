package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CustomisedListBox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		WebElement monthList = driver.findElement(By.xpath("//select[@id='month']"));
		
		Actions act= new Actions(driver);
		act.click(monthList).perform();
//		act.sendKeys(Keys.ARROW_DOWN).perform(); //Sep
//		Thread.sleep(2000);
//		act.sendKeys(Keys.ARROW_DOWN).perform(); //Oct
//		Thread.sleep(2000);
//		act.sendKeys(Keys.ARROW_DOWN).perform(); //Nov
//		Thread.sleep(2000);
//		act.sendKeys(Keys.ARROW_UP).perform(); //Oct
//		Thread.sleep(2000);
//		act.sendKeys(Keys.ENTER).perform();
		for(int i=1; i<=12; i++)
		{
			act.sendKeys(Keys.UP).perform();
		}
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		
	}
}
