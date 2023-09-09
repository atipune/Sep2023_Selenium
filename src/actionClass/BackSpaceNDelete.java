package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BackSpaceNDelete {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
		searchBox.sendKeys("Samsung");
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.BACK_SPACE).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.BACK_SPACE).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.BACK_SPACE).perform();
		Thread.sleep(2000);
//Delete		
		act.keyDown(Keys.CONTROL).sendKeys("A"+"C").keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).build().perform();
	}
}
