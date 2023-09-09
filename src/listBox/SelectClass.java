package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Ne\\June2023_Selenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
//May-Oct-July
		WebElement monthDropDown = driver.findElement(By.xpath("//select[@id='month']"));
		Select s=new Select(monthDropDown);
		Thread.sleep(2000);
//selectByIndex(int)
		s.selectByIndex(4); //index start with 0 for 1st option
		Thread.sleep(2000);
//selectByValue(String)
		s.selectByValue("10");
		Thread.sleep(2000);
//selectByVisibleText(String)
		s.selectByVisibleText("Jul");
		Thread.sleep(2000);
		//driver.close();
	}
}
