package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		WebElement closeBtnPopup = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		
//left click		
		//act.moveToElement(closeBtnPopup).perform();
		//act.click().perform();
		//act.moveToElement(closeBtnPopup).click().build().perform();
		act.click(closeBtnPopup).perform();
		Thread.sleep(2000);
//right click;
		WebElement loginBtn = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		//act.moveToElement(loginBtn).contextClick().build().perform();
		act.contextClick(loginBtn).perform();
//double click -->2 times left click
		act.doubleClick(loginBtn).perform();
		
	}
}
